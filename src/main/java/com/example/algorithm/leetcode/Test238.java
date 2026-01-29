package com.example.algorithm.leetcode;

import com.example.algorithm.Test;

import java.util.Arrays;

/**
 * 238.除了自身以外数组的乘积
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除了 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 *
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
public class Test238 {

    public static void main(String[] args) {
        Test238 test = new Test238();
        int[] nums = {-1,1,0,-3,3};
        int[] answer = test.productExceptSelf(nums);
        System.out.println();
        for (int i : answer){
            System.out.print(i+" ");
        }
    }


    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            answer[i] = nums[i-1]*answer[i-1];
        }
        int suffix=  1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix = suffix*nums[i+1];
            answer[i] = answer[i] * suffix;
        }
        return answer;
    }


}
