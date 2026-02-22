package com.example.algorithm.leetcode;

public class Test153 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        Test153 test = new Test153();

        System.out.println( test.findMin(nums));
    }

    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0 ;
        int right = n - 1;
        int min = nums[0];
        while(left<=right){
            int mid = (left+ right)/2;
            if(nums[mid]<min){
                min = nums[mid];
            }
            if(nums[left]<=nums[mid]){
                if(nums[left]<min){
                    min = nums[left];
                }
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return min;
    }


}
