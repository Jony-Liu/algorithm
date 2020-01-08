package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2020/1/5 14:56
 */
public class DaemonDemo extends Thread{
    private int i = 0;
    @Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println("i="+(i));
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
