package com.example.algorithm.thread;

/**
 * @author Jony-Liu
 * @date 2019/11/21 21:46
 */
public class StoppableTask extends Thread {

    private volatile boolean pleaseStop;

    public StoppableTask(String name ) {
        super(name);
    }

    public void run() {
        while (!pleaseStop) {
            System.out.println(this.getName()+"'s pleaseStop is "+pleaseStop);
        }
    }

    public void tellMeToStop() {
        pleaseStop = true;
    }

}