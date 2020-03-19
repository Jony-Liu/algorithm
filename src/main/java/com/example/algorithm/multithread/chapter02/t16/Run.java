package com.example.algorithm.multithread.chapter02.t16;

/**
 * @author Jony-Liu
 * @date 2020/3/18 21:55
 */
public class Run {
    public static void main(String[] args) {
        try{
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("已经赋值为false");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
