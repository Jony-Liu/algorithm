package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/6/1 21:39
 */
public class TryCatchTest3 {
    private static int total() {
        try {
            System.out.println("执行try");
            return 11;
        } finally {
            System.out.println("执行finally");
        }
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }
}
