package com.example.algorithm.designmode.facade;

import com.example.algorithm.designmode.facade.impl.ServiceAImpl;
import com.example.algorithm.designmode.facade.impl.ServiceBImpl;
import com.example.algorithm.designmode.facade.impl.ServiceCImpl;

/**
 * @author Jony-Liu
 * @date 2019/9/8 19:16
 */
public class Facade {

    ServiceA sa;

    ServiceB sb;

    ServiceC sc;

    public Facade() {
        sa = new ServiceAImpl();
        sb = new ServiceBImpl();
        sc = new ServiceCImpl();
    }

    public void methodA() {
        sa.methodA();
        sb.methodB();
    }

    public void methodB() {
        sb.methodB();
        sc.methodC();
    }

    public void methodC() {
        sc.methodC();
        sa.methodA();
    }
}
