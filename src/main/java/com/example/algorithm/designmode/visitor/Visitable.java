package com.example.algorithm.designmode.visitor;

/**
 * @author Jony-Liu
 * @date 2019/9/15 12:57
 */
public interface Visitable {

    public void accept(Visitor visitor);
}
