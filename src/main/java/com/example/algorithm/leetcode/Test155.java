package com.example.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 155.最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 */
public class Test155 {



}

class MinStack {
    Deque<Integer> normalDeque;
    Deque<Integer> minDeque;

    public MinStack() {
        this.normalDeque = new LinkedList<>();
        this.minDeque = new LinkedList<>();
        this.minDeque.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        this.normalDeque.push(val);
        this.minDeque.push(Math.min(val,this.minDeque.peek()));
    }

    public void pop() {
        this.normalDeque.pop();
        this.minDeque.pop();
    }

    public int top() {
        return this.normalDeque.peek();
    }

    public int getMin() {
        return this.minDeque.peek();
    }
}
