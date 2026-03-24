package com.example.algorithm.leetcode;

import java.util.*;

/**
 * 763.划分字母区间
 */
public class Test763 {

    public static void main(String[] args) {
        String s = "caedbdedda";
        Test763 test = new Test763();
        List<Integer> result = test.partitionLabels(s);
        System.out.println(Arrays.toString(result.toArray()));

    }

    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        char[] chars = s.toCharArray();
//        System.out.println(Arrays.toString(chars));
        Map<Character, Integer> paraMap = new HashMap<>();
        for(char c : chars){
            paraMap.put(c, paraMap.getOrDefault(c, 0)+1);
        }
//        System.out.println(paraMap);
        Map<Character, Integer> subMap = null;
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(subMap==null){
                subMap = new HashMap<>();
            }
            subMap.put(c, subMap.getOrDefault(c,0)+1);
            paraMap.put(c, paraMap.get(c) - 1);
            Set<Character> set = subMap.keySet();
            num = num + 1;
            boolean flag = false;
            for (Character cc : set){
                if(paraMap.get(cc)!=0){
                    flag = true;
                }
            }
            if(!flag){
                result.add(num);
                num = 0;
                subMap = null;
            }

        }
        return result;
    }

}
