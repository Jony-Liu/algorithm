package com.example.algorithm.designmode.proxy;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Factory ft = new AdidasFactory();
        ProxyFactory pf = new ProxyFactory(ft);
        pf.clothProduct();
        System.out.println("--------------------");
        Factory ft1 = new NikeFactory();
        pf = new ProxyFactory(ft1);
        pf.clothProduct();
    }

}