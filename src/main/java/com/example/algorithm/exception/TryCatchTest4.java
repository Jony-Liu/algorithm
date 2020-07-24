package com.example.algorithm.exception;

/**
 * @author Jony-Liu
 * @date 2020/6/2 21:43
 */
public class TryCatchTest4 {

    /**
     * finally执行在catch块return的执行前
     * @return
     */
    private static int total() {
        try {
            System.out.println("执行try");
            return 1 / 0;
        } catch (Exception e) {
            System.out.println("执行catch");
            return 11;
        } finally {
            System.out.println("执行finally");
        }
    }

    public static void main(String[] args) {
        System.out.println("执行main：" + total());
    }

}
