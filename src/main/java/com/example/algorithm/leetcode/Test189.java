package com.example.algorithm.leetcode;

import java.util.Arrays;

/**
 * 189.轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class Test189 {
    public static void main(String[] args) {
        Test189 test = new Test189();
        int[]  nums = {1,2,3,4,5,6,7};int k = 3 ;
        test.rotate3(nums,k);
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+ " ");
        }
    }

    /**
     * XXXXXXX超时XXXXXX
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        for (int j = 0; j < k; j++) {
            int length = nums.length;
            int temp = nums[length-1];
            for (int i = length-2; i >= 0 ; i--){
                nums[i + 1] = nums[i];
            }
            nums[0] = temp;
        }
    }

    public void rotate1(int[] nums, int k) {
        int length = nums.length;
        int index = length - 1;
        int temp = nums[length-1];
        while(k>=length){
            k = k - length;
        }
        int rep = 0;
        int change = 0;
        int change_index = 0 ;
        for (int i = 0; i < length -1 ; i++) {
            if(index - k < 0){
                rep = index - k + length;
            }else{
                rep = index - k;
            }
            change = nums[index];
            nums[index] = nums[rep];
            index = rep;

        }
        nums[index] = temp;
    }


    public void rotate2(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length];
        while(k>=length){
            k = k - length;
        }
        for (int i = 0; i < length; i++) {
            result[(i + k) % length] = nums[i];
        }
        System.arraycopy(result,0,nums,0,length);
    }

    public void rotate3(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
    }

    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }


    }

}
