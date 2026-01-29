package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 *
 * @author jonyliu
 * @date 2025/9/22 15:42
 */
public class Test15 {
    public static void main(String[] args) {
/*
        输入：nums = [-1,0,1,2,-1,-4]
        输出：[[-1,-1,2],[-1,0,1]]

        [-4, -1, -1, 0, 1, 2]

        */

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int first = 0; first<n;++first){
            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }
            int third = n - 1;
            int target = -nums[first];
            for(int secord = first + 1 ;secord<n;++secord){
                if(secord>first+1&&nums[secord]==nums[secord-1]){
                    continue;
                }
                while(secord<third&&nums[secord]+nums[third]>target){
                    --third;
                }
                if(secord==third){
                    break;
                }
                if(nums[secord]+nums[third]==target){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[secord]);
                    list.add(nums[third]);
                    result.add(list);
                }
            }
        }
        return result;
    }
}
