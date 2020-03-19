package com.example.algorithm.multithread.chapter02.t16;

/**
 * @author Jony-Liu
 * @date 2020/3/18 21:52
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;
    public boolean isRunning(){
        return isRunning;
    }

    public void setRunning(boolean isRunning){
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true){
        }
        System.out.println("线程被停止了");
    }
}
