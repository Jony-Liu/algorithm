package com.example.algorithm.designmode.strategy;

/**
 * @author Jony-Liu
 * @date 2019/9/16 21:19
 */
public class Context {

    Strategy stra;

    public Context(Strategy stra) {
        this.stra = stra;
    }

    public void doMethod() {
        stra.method();
    }

}
