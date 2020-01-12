package com.example.algorithm.multithread.chapter02;

public class Sub extends Main {
    synchronized public void operateISubMethod() {
        while (i > 0) {
            try {
                i--;
                System.out.println("sub print t= " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
