package com.example.algorithm.multithread.chapter02;

public class Service {
    /**
     * synchronized 锁重入：在使用 synchronized 时，当一个线程得到一个线程锁后，再次请求此对象时
     * 是可以再次得到这个对象的锁的。
     */
    synchronized public void  service1(){
        System.out.println("service1");
        service2();
    }
    synchronized public void  service2(){
        System.out.println("service2");
        service3();
    }
    synchronized public void  service3(){
        System.out.println("service3");
    }
}
