package com.example.algorithm.designmode.interpreter;

/**
 * @author Jony-Liu
 * @date 2019/8/30 23:43
 */
public class AdvanceExpression extends Expression {

    @Override
    void interpret(Context ctx) {
        System.out.println("这是高级解析器!");
    }
}
