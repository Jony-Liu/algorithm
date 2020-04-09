package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/26 21:51
 */
public class StopThreadTest {
    public static void main(String[] args) {
        try{
            StopThreadDemo stopThreadDemo= new StopThreadDemo();
            stopThreadDemo.start();
            Thread.sleep(200);
            stopThreadDemo.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch ");
            e.printStackTrace();
        }
    }
}
