package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2020/1/5 14:57
 */
public class DaemonTest {
    public static void main(String[] args) throws Exception{
        DaemonDemo thread = new DaemonDemo();
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(5000);
        System.out.println("我离开thread对象也不再打印了，也就是停止了");
    }
}
