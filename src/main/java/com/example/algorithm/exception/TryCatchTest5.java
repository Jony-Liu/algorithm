package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/6/3 21:08
 */
public class TryCatchTest5 {
    private static int total() {
        int i = 0;
        try {
            System.out.println("执行try：" + i);
            return i;
        } finally {
            ++i;
            System.out.println("执行finally：" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }
}
