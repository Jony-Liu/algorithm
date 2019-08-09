package com.example.algorithm.designmode.prototype;

public class Client {
    public static void main(String[] args) {
        Prototype pro1 = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype)pro1.clone();
        System.out.println(pro2.getName());
        System.out.println(pro1.getName());
    }
}
