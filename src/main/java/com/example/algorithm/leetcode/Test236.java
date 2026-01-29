package com.example.algorithm.leetcode;

import java.util.Arrays;

/**
 *
 * 239. 滑动窗口最大值
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回 滑动窗口中的最大值 。
 *
 * @author jonyliu
 * @date 2025/10/16 16:25
 */
public class Test236 {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
//        int[] s=new int[4];
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
    }

    //超时
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        for(int i = 0;i<nums.length - k+1;i++){
            int max = nums[i];
            for(int j = i+1;j< i + k;j++){
                if(nums[j]>max){
                    max = nums[j];
                }
            }
            result[i] = max;
        }
        return result;
    }


//    int[] result = new int[nums.length - k - 1];
//    int max = nums[0];
//    int index = 0;
//    //先计算第一个滑动窗口最大值和最大值下标
//        for(int i=0;i<k;i++){
//        if(nums[i]>max){
//            max = nums[i];
//            index = i;
//        }
//    }
//    result[0] = max;
//    //存在第二个窗口
//        if(nums.length>k){//5
//        for(int j = 1;j<nums.length - k;j++){
//
//        }
//    }


}
