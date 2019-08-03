package com.example.algorithm.thread;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }

}