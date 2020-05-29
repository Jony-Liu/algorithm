package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/5/29 21:26
 */
public class TryCatchTest {
    private static int total() {
        int i = 11;
        if (i == 11) {
            return i;
        }
        try {
            System.out.println("执行try");
        } finally {
            System.out.println("执行finally");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }
}
