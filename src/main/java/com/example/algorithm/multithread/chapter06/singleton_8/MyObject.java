package com.example.algorithm.multithread.chapter06.singleton_8;

/**
 * @author Jony-Liu
 * @date 2020/4/5 22:10
 */
public class MyObject {
    private static MyObject instance = null;

    private MyObject(){
    }

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance(){
        return instance;
    }
}
