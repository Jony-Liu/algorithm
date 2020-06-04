package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/6/3 21:09
 */
public class TryCatchTest6 {
    private static int total() {
        try {
            System.out.println("执行try");
            return 1;
        } finally {
            System.out.println("执行finally");
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }
}
