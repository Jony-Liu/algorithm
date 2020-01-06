package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:26
 */
public class MyObjectTest {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        MyObjectThreadA myObjectThreadA = new MyObjectThreadA(myObject);
        myObjectThreadA.start();
        MyObjectThreadB myObjectThreadB = new MyObjectThreadB(myObject);
        myObjectThreadB.start();
    }
}
