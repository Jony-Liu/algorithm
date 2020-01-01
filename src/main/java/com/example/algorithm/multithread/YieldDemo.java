package com.example.algorithm.multithread;

/**
 * @author Jony-Liu
 * @date 2020/1/1 20:16
 */
public class YieldDemo extends Thread{

    @Override
    public void run() {

        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i=0;i<50000000;i++){
            Thread.yield();
            count = count +(i++);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime));
    }
}
