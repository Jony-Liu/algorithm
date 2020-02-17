package com.example.algorithm.multithread.chapter02.deadLockDemo;

/**
 * @author Jony-Liu
 * @date: 2020/2/17 10:55
 */
public class DealThread implements Runnable {
    public String username;

    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username = " + this.username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("按 lock1 -》lock2 代码顺序执行了");
                }
            }

        }
        if (username.equals("b")) {
            synchronized (lock2) {
                try {
                    System.out.println("username = " + this.username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("按 lock2 -》lock1 代码顺序执行了");
                }
            }

        }
    }
}
