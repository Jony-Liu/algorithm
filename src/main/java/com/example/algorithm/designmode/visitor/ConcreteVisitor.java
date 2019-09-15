package com.example.algorithm.designmode.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Jony-Liu
 * @date 2019/9/15 12:57
 */
public class ConcreteVisitor implements Visitor {

    public void visitCollection(Collection collection) {
        // TODO Auto-generated method stub
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable) {
                ((Visitable)o).accept(this);
            }
        }
    }

    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getFe());
    }

    public void visitString(StringElement stringE) {
        System.out.println(stringE.getSe());
    }
}
