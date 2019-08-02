package com.example.algorithm.exception;

public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        int a = 4;
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                throw new Exception("抛出异常");
        }
    }
}
