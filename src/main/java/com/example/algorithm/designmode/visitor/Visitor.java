package com.example.algorithm.designmode.visitor;

import java.util.Collection;

/**
 * @author Jony-Liu
 * @date 2019/9/15 12:56
 */
public interface Visitor {

    public void visitString(StringElement stringE);

    public void visitFloat(FloatElement floatE);

    public void visitCollection(Collection collection);
}

