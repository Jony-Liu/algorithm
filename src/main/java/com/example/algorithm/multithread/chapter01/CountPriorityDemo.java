package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2020/1/5 14:41
 */
public class CountPriorityDemo extends Thread {
    private int count = 0;
    public int getCount(){
        return count;
    }

    @Override
    public void run() {
        while (true){
            count++;
        }
    }
}
