package com.example.algorithm.multithread.chapter01;

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
            //放弃当前CPU资源，放弃时间不确定，可能刚放弃就活动CPU
            Thread.yield();
            count = count +(i++);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime));
    }
}
