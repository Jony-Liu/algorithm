package com.example.algorithm.multithread.chapter03;

/**
 * @author Jony-Liu
 * @date 2020/3/24 22:15
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
