package com.example.algorithm.multithread.chapter05;

/**
 * @author Jony-Liu
 * @date 2020/4/5 0:06
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main start "+System.currentTimeMillis());
        new Reminder();
    }
}
