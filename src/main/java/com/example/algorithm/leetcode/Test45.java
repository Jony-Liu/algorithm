package com.example.algorithm.leetcode;

/**
 * 45.跳跃游戏II
 */
public class Test45 {

    public static void main(String[] args) {

    }
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int step = 0;
        for (int i = 0; i < length; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if(i==end+1){
                end = maxPosition;
                step ++ ;
            }
        }
        return step;
    }

}
