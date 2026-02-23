package com.example.algorithm.leetcode;

/**
 * 121.买卖股票的最佳时机
 */
public class Test121 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Test121 test = new Test121();
        System.out.println(test.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }


}
