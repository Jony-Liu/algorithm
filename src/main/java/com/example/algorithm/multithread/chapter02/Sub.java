package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:24
 */
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
