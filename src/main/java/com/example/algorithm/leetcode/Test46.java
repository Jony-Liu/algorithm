package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 46.全排列
 */
public class Test46 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> output = new ArrayList<>();
        for(int i : nums){
            output.add(i);
        }
        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n , List<Integer> output ,List<List<Integer>> res,int first){
        if(first==n){
            res.add(new ArrayList<>(output));
        }
        for(int i = first;i<n;i++){
            Collections.swap(output,first,i);
            backtrack(n,output,res,first+1);
            Collections.swap(output,i,first);
        }
    }

}
