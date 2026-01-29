package com.example.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 * @author jonyliu
 * @date 2025/9/24 15:29
 */
public class Test3 {

    public static void main(String[] args) {
        String s = "abcabcbbe";
        System.out.println(lengthOfLongestSubstring(s));
    }


    public static int lengthOfLongestSubstring(String s) {
        int right = -1;
        Set<Character> set = new HashSet<>();
        char[] cs = s.toCharArray();
        int n = cs.length;
        int max = 0;
        for(int left = 0 ;left<n;left++){
            if(left>0){
                set.remove(cs[left-1]);
            }
            while (right+1<n&&!set.contains(cs[right+1])){
                set.add(cs[right+1]);
                right++;
            }
            if(max<set.size()){
                max = set.size();
            }
        }
        return max;
    }
}
