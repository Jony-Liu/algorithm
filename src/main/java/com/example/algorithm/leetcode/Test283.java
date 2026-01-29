package com.example.algorithm.leetcode;

import java.util.Arrays;

/**
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * @author jonyliu
 * @date 2025/9/22 14:17
 */
public class Test283 {
    public static void main(String[] args) {
        /*
        输入: nums = [0,1,0,3,12]

        1,0,0,3,12
        1 3 0 0 12
        1 3 12 0 0

        输出: [1,3,12,0,0]
        */
        int[] nums = {5,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        while(right<n){
            if(nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] nums,int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
