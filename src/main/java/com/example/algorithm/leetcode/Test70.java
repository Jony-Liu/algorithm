package com.example.algorithm.leetcode;

/**
 * 70.爬楼梯
 */
public class Test70 {

    public static void main(String[] args) {
        Test70 test = new Test70();
        System.out.println(test.climbStairs(3));
    }

    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int climbStairs1(int n) {
        if(n==1){
            return 1;
        }
        int p= 1;
        int q = 2;
        int r = 0;
        for(int i = 3;i<=n;i++){
            r = q + p;
            p = q;
            q = r;
        }
        return q;
    }

}
