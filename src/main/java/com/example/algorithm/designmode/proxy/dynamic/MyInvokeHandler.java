package com.example.algorithm.designmode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Jony-Liu
 */
public class MyInvokeHandler implements InvocationHandler {

    private Object obj;

    public Object blink(Object obj) {
        this.obj = obj;
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始");
        Object returnVal = method.invoke(obj, args);
        System.out.println("代理结束");
        return returnVal;
    }

}
