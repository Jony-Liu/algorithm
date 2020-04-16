package com.example.algorithm.multithread.chapter06.singleton_9;

/**
 * 使用static代码块实现单例模式
 *
 * @author Jony-Liu
 * @date 2020/4/5 23:20
 */
public class MyObject {
    private static MyObject instance = null;

    private MyObject() {
    }

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}
