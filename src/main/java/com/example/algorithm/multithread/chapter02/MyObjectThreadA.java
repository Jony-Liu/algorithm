package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:23
 */
public class MyObjectThreadA extends Thread {
   private   MyObject myObject;
    public MyObjectThreadA(MyObject myObject){
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA(100);
    }
}
