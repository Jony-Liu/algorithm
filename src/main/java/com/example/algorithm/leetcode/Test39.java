package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39.组合总和
 */
public class Test39 {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        Test39 test = new Test39();
        List<List<Integer>>  res = test.combinationSum(candidates, target);
        for(List<Integer> l:res){
            System.out.println(Arrays.toString(l.toArray()));
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        backtrack(res,candidates,sub,target,0);
        return res;

    }

    public void backtrack( List<List<Integer>> res,int[] candidates, List<Integer> sub , int target,int first){
        if(target<=0){
            if(target==0){
                res.add(new ArrayList<>(sub));
            }
            return;
        }
        for (int i = first; i < candidates.length; i++) {
            int cur = candidates[i];
            sub.add(cur);
            backtrack(res,candidates, sub, target - cur,i);
            sub.remove(sub.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum1(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        // 直接跳过
//        dfs(candidates, target, ans, combine, idx + 1);
        // 选择当前数
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
        dfs(candidates, target, ans, combine, idx + 1);
    }


}
