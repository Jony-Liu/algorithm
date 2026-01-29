package com.example.algorithm.leetcode;

/**
 * 53.最大子数组和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组是数组中的一个连续部分。
 */
public class Test53 {
    public static void main(String[] args) {
        Test53 test = new Test53();
        int result = test.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(result);
    }

    public int maxSubArray(int[] nums) {
        int pre = 0 ; int max = nums[0];
        for(int num:nums){
            pre = Math.max(pre + num, num);
            max = Math.max(pre, max);
        }
        return max;
    }

}
