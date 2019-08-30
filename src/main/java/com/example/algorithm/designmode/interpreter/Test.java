package com.example.algorithm.designmode.interpreter;

/**
 * @author Jony-Liu
 * @date 2019/8/30 23:44
 */
public class Test {

    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());
        for (Object eps : ctx.getList()) {
            Expression e = (Expression) eps;
            e.interpret(ctx);
        }
    }

}
