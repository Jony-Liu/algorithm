package com.example.algorithm.designmode.proxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    Object obj;

    public void setObject(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        HumanUtil h1 = new HumanUtil();//组合/聚合复用的原则：
        //定义：优先使用组合，使系统更灵活，其次才是考虑到继承，达到复用的目的。
        h1.before();
        Object result = method.invoke(obj, args);
        h1.after();
        return result;
    }

}