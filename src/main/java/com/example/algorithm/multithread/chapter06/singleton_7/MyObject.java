package com.example.algorithm.multithread.chapter06.singleton_7;

/**
 * @author Jony-Liu
 * @date 2020/4/5 21:16
 */
public class MyObject {
    //内部类方式
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
    private MyObject(){
    }
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
