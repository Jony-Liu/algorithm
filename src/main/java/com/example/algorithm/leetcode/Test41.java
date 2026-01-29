package com.example.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 41.缺失的第一个正数
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 *
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 *
 */
public class Test41 {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));

        Set<Integer> set = new HashSet();
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int result = 1;
        int index = 0 ;
        while(index<nums.length){
            if(nums[index]>0){
                if(index>=1&&nums[index]==nums[index -1]){
                    index++;
                }else if(nums[index]==result){
                    result ++ ;
                    index++;
                }else{
                    return result;
                }
            }
        }
        return result;
    }

    public static int firstMissingPositive1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <n; i++) {
            if(nums[i]<=0){
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n ; i++) {
            int num = Math.abs(nums[i]);
            if(num-1< n){
                nums[num-1] = -Math.abs(nums[num-1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
