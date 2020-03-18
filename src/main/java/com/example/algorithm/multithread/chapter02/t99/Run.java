package com.example.algorithm.multithread.chapter02.t99;

/**
 * @author Jony-Liu
 * @date: 2020/3/18 21:28
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止它！ stopThread = "+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
