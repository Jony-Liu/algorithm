package com.example.algorithm.leetcode;

/**
 * 198.打家劫舍
 */
public class Test198 {

    public static void main(String[] args) {
        Test198 test = new Test198();
        int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        System.out.println(test.rob(nums));
    }

    public int rob(int[] nums) {
        int k = nums.length;
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
          test(nums, i, temp);
        }
        return temp[k-1];
    }


    public void test(int[] nums,int k ,int[] temp){
        if(k==0){
            temp[0] = nums[0];
            return;
        }
        if(k==1){
            if(nums[0]>nums[1]){
                temp[1] = nums[0];
                return;
            }else{
                temp[1] = nums[1];
                return;
            }
        }
        int a = temp[k-2] + nums[k];
        int b = temp[k - 1];
        if(a>b){
            temp[k]=a;
        }else{
            temp[k]=b;
        }

    }

}
