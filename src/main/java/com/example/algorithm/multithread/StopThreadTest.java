package com.example.algorithm.multithread;

/**
 * @author jonyliu
 * @date 2019/12/26 21:51
 */
public class StopThreadTest {
    public static void main(String[] args) {
        try{
            StopThreadDemo stopThreadDemo= new StopThreadDemo();
            stopThreadDemo.start();
            Thread.sleep(2000);
            stopThreadDemo.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch ");
            e.printStackTrace();
        }
    }
}
