package com.example.algorithm.designmode.strategy;

/**
 * @author Jony-Liu
 * @date 2019/9/16 21:19
 */
public class Test {

    public static void main(String[] args) {
        Context ctx = new Context(new StrategyImplA());
        ctx.doMethod();

        ctx = new Context(new StrategyImplB());
        ctx.doMethod();

        ctx = new Context(new StrategyImplC());
        ctx.doMethod();
    }

}
