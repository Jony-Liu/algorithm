package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/5/31 15:48
 */
public class TryCatchTest2 {
    private static int total() {
        try {
            System.out.println("执行try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("执行catch");
        } finally {
            System.out.println("执行finally");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }
}
