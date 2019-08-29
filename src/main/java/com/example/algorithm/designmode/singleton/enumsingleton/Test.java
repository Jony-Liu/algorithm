package com.example.algorithm.designmode.singleton.enumsingleton;

/**
 * @author Jony-Liu
 * @date 2019/8/29 17:22
 */
public class Test {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        System.out.println(enumSingleton);
    }
}
