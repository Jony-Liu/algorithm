package com.example.algorithm.designmode.proxy.aop;

public class Test {

    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human human = (Human)(new MyProxy().getProxyInstance(superMan));
        human.info();
        System.out.println("------------------");
        human.fly();
    }

}
