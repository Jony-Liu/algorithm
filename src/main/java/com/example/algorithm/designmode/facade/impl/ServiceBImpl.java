package com.example.algorithm.designmode.facade.impl;

import com.example.algorithm.designmode.facade.ServiceB;

/**
 * @author Jony-Liu
 * @date 2019/9/8 19:20
 */
public class ServiceBImpl implements ServiceB {
    @Override
    public void methodB() {
        System.out.println("这是服务B");
    }
}
