package com.example.algorithm.designmode.proxy.aop;

import java.lang.reflect.Proxy;

/**
 * @author Jony-Liu
 */
public class MyProxy {

    public Object getProxyInstance(Object obj) {
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.setObject(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }

}
