package com.example.algorithm.designmode.mediator;

/**
 * @author Jony-Liu
 * @date 2019/9/14 18:01
 */
public class Test {
    public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //老板来了
        med.notice("boss");
        //客户来了
        med.notice("client");
    }

}
