package com.example.algorithm.designmode.facade;

import com.example.algorithm.designmode.facade.impl.ServiceAImpl;
import com.example.algorithm.designmode.facade.impl.ServiceBImpl;

/**
 * @author Jony-Liu
 * @date 2019/9/8 19:22
 */
public class Test {
    public static void main(String[] args) {
        ServiceA sa = new ServiceAImpl();
        ServiceB sb = new ServiceBImpl();

        sa.methodA();
        sb.methodB();

        System.out.println("========");
        //facade
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
