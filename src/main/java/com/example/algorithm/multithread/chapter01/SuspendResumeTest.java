package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/28 22:19
 */
public class SuspendResumeTest {
    @Deprecated
    public static void main(String[] args) {
        try {
            SuspendResumeDemo thread = new SuspendResumeDemo();
            thread.start();
            Thread.sleep(5000);
            thread.suspend();
            System.out.println("A="+System.currentTimeMillis()+" i = "+thread.getI());
            Thread.sleep(5000);
            System.out.println("A="+System.currentTimeMillis()+" i = "+thread.getI());
            //B
            thread.resume();
            Thread.sleep(5000);
            //c
            thread.suspend();
            System.out.println("B="+System.currentTimeMillis()+" i = "+thread.getI());
            Thread.sleep(5000);
            System.out.println("B="+System.currentTimeMillis()+" i = "+thread.getI());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
