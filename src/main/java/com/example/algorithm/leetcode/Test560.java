package com.example.algorithm.leetcode;

/**
 *
 * 560. 和为 K 的子数组
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
 * 子数组是数组中元素的连续非空序列。
 *
 * @author jonyliu
 * @date 2025/10/16 15:58
 */
public class Test560 {

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums,k));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0 ;
        for(int left = 0;left<nums.length;left++){
            int sum = 0;
            for(int right = left;right<nums.length;right++){
                sum = sum + nums[right];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }

}
