package com.example.algorithm.designmode.adapter;

/**
 * @author Jony-Liu
 * @date 2019/9/2 16:24
 */
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }

}
