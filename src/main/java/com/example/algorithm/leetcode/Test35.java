package com.example.algorithm.leetcode;

public class Test35 {
    public static void main(String[] args) {
        Test35 test = new Test35();
        System.out.println(test.searchInsert1(new int[]{3,5,7,9,10}, 8));
    }

    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int result = -1;
        int start = 0 ;
        int end = n - 1;
        while(result==-1){
            int middle = (start + end)/2;
            if(nums[middle]==target){
                result = middle;
            }else if (nums[middle]>target){
                end = middle - 1;
                if(start == end){
                    if(nums[start] >= target){
                        result = start;
                    }else{
                        result = start + 1;
                    }
                }
                if(end<0){
                    result = 0;
                }
            }else if (nums[middle]<target){
                start = middle + 1;
                if(start > n-1 ){
                    result = start;
                }
                if(start == end){
                    if(target>nums[start]){
                        result = end + 1;
                    }else{
                        result = start;
                    }
                }
            }
        }
        return result;
    }


    public int searchInsert1(int[] nums, int target) {

        int n = nums.length;
        int result = -1;
        int start = 0 ;
        int end = n - 1;
        int middle = -1;
        while(start<=end){
            middle = (start + end)/2;
            if(nums[middle] == target){
                return middle;
            }else if (nums[middle] < target){
                start = middle + 1;
                result = start;
            }else if (nums[middle] > target){
                end = middle - 1;
                result = middle;
            }
            if(start == end){
                if(target>nums[start]){
                    return start + 1;
                }else{
                    return start;
                }
            }

        }
        return result;
    }

    public int searchInsert2(int[] nums, int target) {
        int n = nums.length;
        int result = n;
        int start = 0 ;
        int end = n - 1;
        while(start<=end){
            int middle = (start + end)/2;
            if (nums[middle] < target){
                start = middle + 1;
            }else if (nums[middle] >=  target){
                result = middle;
                end = middle - 1;
            }
        }
        return result;
    }
}
