package com.example.algorithm.designmode.visitor;

/**
 * @author Jony-Liu
 * @date 2019/9/15 12:58
 */
public class StringElement implements Visitable {

    private String se;

    public StringElement(String se) {
        this.se = se;
    }

    public String getSe() {
        return this.se;
    }

    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}

