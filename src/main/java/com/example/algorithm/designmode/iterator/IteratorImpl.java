package com.example.algorithm.designmode.iterator;

/**
 * @author Jony-Liu
 * @date 2019/9/20 21:25
 */
public class IteratorImpl implements Iterator {

    private List list;

    private int index;

    public IteratorImpl(List list) {
        index = 0;
        this.list = list;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = list.getSize();
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }
}

