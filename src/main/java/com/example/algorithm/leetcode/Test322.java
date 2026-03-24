package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 322.零钱兑换
 */
public class Test322 {

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 100;
        Test322 test = new Test322();
        System.out.println(test.coinChange(coins,amount));
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int max = amount + 1;
        Arrays.fill(dp,max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(i>=coins[j]){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        return dp[amount] > amount ? -1:dp[amount];
    }


}
