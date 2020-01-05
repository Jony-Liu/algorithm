package com.example.algorithm.multithread.chapter01;

/**
 * @author jonyliu
 * @date 2019/12/23 8:59
 */
public class CountOperate  extends  Thread {
    public CountOperate(){
        System.out.println("CountOperate--begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate--end");
    }
    @Override
    public void run(){
        System.out.println("run--begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run--end");

    }
}
