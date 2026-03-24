package com.example.algorithm.leetcode;

import java.util.*;

/**
 * 17.电话号码的字母组合
 */
public class Test17 {

    public static void main(String[] args) {
        Test17 test = new Test17();
        List<String> res = test.letterCombinations("23");
        System.out.println(res);
    }

    public List<String> letterCombinations(String digits) {
        Map<Integer, List<Character>> map = new HashMap<>();
        map.put(2, generateList("abc"));
        map.put(3, generateList("def"));
        map.put(4, generateList("ghi"));
        map.put(5, generateList("jkl"));
        map.put(6, generateList("mno"));
        map.put(7, generateList("pqrs"));
        map.put(8, generateList("tuv"));
        map.put(9, generateList("wxyz"));

        int n = digits.length();
        String[] dd = digits.split("");
        int[] nums = new int[n];
        for (int i = 0; i < n ; i++) {
            nums[i] = Integer.parseInt(dd[i]);
        }
        char[] sub = new char[n];
        List<String> res =new ArrayList<>();
        backtrack(n,nums,sub,res,0,map);
        return res;
    }

    public void backtrack(int n,int[] nums, char[] sub,List<String> res,int first,Map<Integer, List<Character>> map){
        if(first == n){
            String s = String.valueOf(sub);
            res.add(s);
            return;
        }
        int num = nums[first];
        //获取枚举值
        List<Character> c = map.get(num);
        for (int i = 0; i < c.size(); i++) {
            sub[first] = c.get(i);
            backtrack(n,nums,sub,res,first+1,map);
        }
    }

    public List<Character> generateList(String str){
        char[] chars = str.toCharArray();
        List<Character> ll =new ArrayList<>();
        for (char c : chars) {
            ll.add(c);
        }
        return ll;
    }


}
