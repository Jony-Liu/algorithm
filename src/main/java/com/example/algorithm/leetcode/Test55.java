package com.example.algorithm.leetcode;

/**
 * 55.跳跃游戏
 */
public class Test55 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        Test55 test = new Test55();
        test.canJump(nums);
    }

    public boolean canJump(int[] nums) {
        int rightmost = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(rightmost>=i){
                rightmost = Math.max(rightmost, i + nums[i]);
                if(rightmost>=n-1){
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }

}
