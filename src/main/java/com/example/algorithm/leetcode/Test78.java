package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test78 {

    public static void main(String[] args) {
        Test78 test = new Test78();
        int[] nums = {1,2,3};
        List<List<Integer>> res = test.subsets(nums);
        for (List<Integer> l:res){
            System.out.println(Arrays.toString(l.toArray()));
        }

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        int n = nums.length;
        backtrack(nums, sub, res, n, 0);
        return res;
    }

    public void backtrack(int[] nums,List<Integer> sub, List<List<Integer>> res,int n ,int first){
        if(first == n){
            res.add(sub);
            return;
        }
        List<Integer> sub1= new ArrayList<>(sub);
        //什么也不放
        backtrack(nums,sub,res,n,first+1);
        //放当前
        sub1.add(nums[first]);
        backtrack(nums,sub1,res,n,first+1);
    }

}
