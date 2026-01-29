package com.example.algorithm.leetcode;

import java.util.*;

/**
 * 字母异位词分组
 *
 * @author jonyliu
 * @date 2025/9/19 17:43
 */
public class Test49 {

    /*
        输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

        输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
    */
    public static void main(String[] args) {
        String s = "eat";
        String sOrg = new String(s);
        char[] c = s.toCharArray();

//        System.out.println(c);
        System.out.println(sOrg);
        String result = new String(c);
        System.out.println(result);
        System.out.println("------------------");
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Test49 t = new Test49();
        System.out.println(t.groupAnagrams(str));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List> map = new HashMap<>();
        for (int i = 0; i < strs.length ; i++) {
            String oOrg = new String(strs[i]);
            char[] c =  strs[i].toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(map.get(key)!=null){
                List list = map.get(key);
                list.add(oOrg);
            }else{
                List<String> list = new ArrayList<>();
                list.add(oOrg);
                map.put(key, list);
            }
        }
        for(Map.Entry<String,List> mapEntry : map.entrySet()){
            result.add(mapEntry.getValue());
        }
        return result;
    }

}
