package com.example.algorithm.designmode.iterator;

/**
 * @author Jony-Liu
 * @date 2019/9/20 21:25
 */
public interface List {

    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);
}

