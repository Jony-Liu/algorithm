package com.example.algorithm.multithread.chapter02.t9;

/**
 * @author Jony-Liu
 * @date 2020/1/20 17:06
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList myOneList = new MyOneList();
        MyThread1 myThread1 = new MyThread1(myOneList);
        myThread1.setName("A");
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(myOneList);
        myThread2.setName("A");
        myThread2.start();
        Thread.sleep(6000);
        System.out.println("listSize = "+ myOneList.getSize());
    }
}
