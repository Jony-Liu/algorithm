package com.example.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 *
 * @author jonyliu
 * @date 2025/9/19 17:19
 */
public class Test1 {
    public static void main(String[] args) {
        int[] result = new int[2];
        int[] nums = {3,2,4};
        int target = 6;
        Test1 t = new Test1();
        result = t.twoSum3(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        int targetHash = Integer.valueOf(target).hashCode();
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Integer.valueOf(nums[i] + nums[j]).hashCode() == targetHash) {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum3(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hashMap.get(target-nums[i])!=null){
                result[0] = hashMap.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            hashMap.put(nums[i], i);
        }
        return result;
    }


}
