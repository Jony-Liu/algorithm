package com.example.algorithm.multithread.chapter02.synchronizedUpdateNewValue;

/**
 * synchronized代码块有volatile同步的功能
 * @author Jony-Liu
 * @date 2020/3/19 23:02
 */
public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        String anyString = new String();
        while (isContinueRun == true) {
            synchronized (anyString) {
            }
        }
        System.out.println("停下来了");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
