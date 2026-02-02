package com.example.algorithm.leetcode;

import java.util.Arrays;

/**
 * 34.在排序数组中查找元素的第一个和最后一个位置
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 */
public class Test34 {
    public static void main(String[] args) {
        Test34 test = new Test34();
        int[]  nums = {};
        int target = 0;
        System.out.println(Arrays.toString(test.searchRange(nums, target))); ;
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length - 1;
        int n = nums.length;
        int[] result = {-1,-1};
        while(left<=right){
            int middle = (left+right)/2;
            if(nums[middle]==target){
                int start= middle;
                int end = middle;
                while(start - 1 >= 0){
                    if(nums[start - 1]==target){
                        start = start - 1;
                    }else{
                        break;
                    }
                }
                while(end + 1 < n){
                    if(nums[end + 1] == target){
                        end = end + 1;
                    }else{
                        break;
                    }
                }
                result = new int[]{start, end};
                return result;
            }else if(nums[middle]>target){
                right =middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return result;
    }

}
