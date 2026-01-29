package com.example.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 128. 最长连续序列
 *
 * @author jonyliu
 * @date 2025/9/19 18:39
 */
public class Test128 {
    public static void main(String[] args) {
       int[] nums = {100,4,200,1,3,2};
       ;
        int[] nums1 = {0,1,1,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Iterator<Integer> it = set.iterator();
        int[] nums1 = new int[set.size()];
        int i = 0;
        while (it.hasNext()){
            nums1[i] = it.next();
             i++;
        }
        Arrays.sort(nums1);
        int left = 0;
        int right = 0;
        int max = right - left + 1;
        while(right<nums1.length){
            if(right>=1&&nums1[right]-nums1[right-1]==1){
                if(right-left+1>max){
                    max = right-left+1 ;
                }
            }else {
                left = right;
            }
            right++;
        }
        return max;
    }


}
