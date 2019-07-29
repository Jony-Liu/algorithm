package com.example.algorithm.thread;

public class MyThread extends Thread {

    public MyThread() {
        // TODO Auto-generated constructor stub
    }

    public MyThread(String name) {

        super(name);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        //super.run();
        for(int i= 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":  "+i);
        }
    }
}
