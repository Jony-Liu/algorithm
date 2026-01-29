package com.example.algorithm.leetcode;

import java.util.*;

/**
 * 438. 找到字符串中所有字母异位词
 * @author jonyliu
 * @date 2025/9/24 16:25
 */
public class Test438 {

    public static void main(String[] args) {
/*
        输入: s = "cbaebabacd", p = "abc"
        输出: [0,6]

        */

        String s = "cbaebabacd";
        List<Integer> result = findAnagrams1(s, "abc");
     /*   List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('a');
        list.remove(Character.valueOf('b'));
        System.out.println(list.size());*/
        System.out.println(result.toString());
    }

    /**
     * 超时
     *
     * @param s
     * @param p
     * @return
     */
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        char[] chars = p.toCharArray();
        char[] sc = s.toCharArray();
        int n = sc.length;
        for(int left =0 ;left< n;left++){
            int right = left;
            List<Character> list = new ArrayList<>();
            for(char c :chars){
                list.add(c);
            }
            while(right<n&&list.remove(Character.valueOf(sc[right]))){
                if(list.size()==0){
                    result.add(left);
                    break;
                }
                right++;
            }
        }
        return result;
    }

        public static List<Integer> findAnagrams1(String s, String p) {
            int sLen = s.length(), pLen = p.length();

            if (sLen < pLen) {
                return new ArrayList<Integer>();
            }

            List<Integer> ans = new ArrayList<Integer>();
            int[] sCount = new int[26];
            int[] pCount = new int[26];
            for (int i = 0; i < pLen; ++i) {
                ++sCount[s.charAt(i) - 'a'];
                ++pCount[p.charAt(i) - 'a'];
            }

            if (Arrays.equals(sCount, pCount)) {
                ans.add(0);
            }

            for (int i = 0; i < sLen - pLen; ++i) {
                --sCount[s.charAt(i) - 'a'];
                ++sCount[s.charAt(i + pLen) - 'a'];

                if (Arrays.equals(sCount, pCount)) {
                    ans.add(i + 1);
                }
            }

            return ans;
        }

}
