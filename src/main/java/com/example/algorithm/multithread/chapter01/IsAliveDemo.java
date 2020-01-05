package com.example.algorithm.multithread.chapter01;

/**
 * @author jonyliu
 * @date 2019/12/24 9:07
 */
public class IsAliveDemo extends Thread{

    public IsAliveDemo(){
        System.out.println("IsAliveDemo--begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("Thread.currentThread().isAlive() ="+Thread.currentThread().isAlive());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("IsAliveDemo--end");
    }

    @Override
    public void run() {
        System.out.println("run--begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("Thread.currentThread().isAlive() ="+Thread.currentThread().isAlive());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("run--end");
    }
}
