package com.example.algorithm.multithread.chapter01;

public class PriorityDemo extends Thread{
    @Override
    public void run() {
        System.out.println("PriorityDemo's Priority: "+this.getPriority());
        PriorityDemo02 priorityDemo02 = new PriorityDemo02();
        priorityDemo02.start();
    }
}

class PriorityDemo02 extends Thread{
    @Override
    public void run() {
        System.out.println("PriorityDemo02's Priority: "+this.getPriority());
    }
}
