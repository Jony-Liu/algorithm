package com.example.algorithm.leetcode;

/**
 * 279.完全平方数
 */
public class Test279 {

    public static void main(String[] args) {

    }

    public int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <=n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                min = Math.min(min, f[i - j * j]);
            }
            f[i] = 1 + min;
        }
        return f[n];
    }

}
