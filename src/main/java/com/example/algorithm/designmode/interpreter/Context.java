package com.example.algorithm.designmode.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jony-Liu
 * @date 2019/8/30 23:43
 */
public class Context {

    private String content;

    private List list = new ArrayList();

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void add(Expression eps) {
        list.add(eps);
    }

    public List getList() {
        return list;
    }
}

