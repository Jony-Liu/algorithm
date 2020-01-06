package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:24
 */
public class MyObjectThreadB extends  Thread {
    private   MyObject myObject;
    public MyObjectThreadB(MyObject myObject){
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB(200);
    }
}
