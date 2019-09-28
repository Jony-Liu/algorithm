package com.example.algorithm.demo;

/**
 * @author Jony-Liu
 * @date 2019/9/28 21:00
 */
public class Outter {
    static class Inner {
        static int paramOne = 5;
        static final int paramTwo = 5;
        static final int paramThree = new Integer(5);
    }

    public static void main(String[] args) {
        System.out.println(Inner.paramOne);
        System.out.println(Inner.paramTwo);
        System.out.println(Inner.paramThree);
    }
}
