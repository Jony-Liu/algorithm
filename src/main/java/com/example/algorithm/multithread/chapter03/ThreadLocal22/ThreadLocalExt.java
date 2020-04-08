package com.example.algorithm.multithread.chapter03.ThreadLocal22;

/**
 * @author Jony-Liu
 * @date 2020/3/29 19:53
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "默认值 第一次get()不会为null";
    }
}
