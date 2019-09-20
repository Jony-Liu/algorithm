package com.example.algorithm.designmode.iterator;

/**
 * @author Jony-Liu
 * @date 2019/9/20 21:24
 */
public interface Iterator {

    /**
     * next
     * @return
     */
    Object next();

    /**
     * first
     */
    void first();

    /**
     * last
     */
    void last();

    /**
     *
     * @return
     */
    boolean hasNext();
}

