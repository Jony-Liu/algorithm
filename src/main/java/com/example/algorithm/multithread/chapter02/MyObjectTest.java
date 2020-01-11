package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:26
 */
public class MyObjectTest {
    /**
     * 在对同一个实例对象进行赋值的时候，对set/get方法都
     * 使用 synchronized 修饰，可防止读脏数据
     * @param args
     */
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        MyObjectThreadA myObjectThreadA = new MyObjectThreadA(myObject);
        myObjectThreadA.start();
        MyObjectThreadB myObjectThreadB = new MyObjectThreadB(myObject);
        myObjectThreadB.start();
    }
}
