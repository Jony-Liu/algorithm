package com.example.algorithm.designmode.facade.impl;

import com.example.algorithm.designmode.facade.ServiceA;

/**
 * @author Jony-Liu
 * @date 2019/9/8 19:20
 */
public class ServiceAImpl implements ServiceA {
    @Override
    public void methodA() {
        System.out.println("这是服务A");
    }

}
