package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/5/30 19:15
 */
public class TryCatchTest1 {
    private static int total() {
        return 1 / 0;
//        try {
//            System.out.println("执行try");
//        } finally {
//            System.out.println("执行finally");
//        }
//        return 0;
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }
}
