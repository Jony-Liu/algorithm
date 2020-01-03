package com.example.algorithm.multithread;

public class PriorityDemo extends Thread{
    @Override
    public void run() {
        System.out.println("PriorityDemo's Priority: "+this.getPriority());
    }
}
