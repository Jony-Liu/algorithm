package com.example.algorithm.multithread;

/**
 * @author Jony-Liu
 * @date 2019/12/22 18:52
 */
public class MyThread extends Thread {

    private  int i = 5;
    @Override
    public void run(){
        synchronized (this){
            System.out.println("i="+(i--)+" threadName = "+Thread.currentThread().getName());
        }
    }

}
