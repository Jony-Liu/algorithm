package com.example.algorithm.leetcode;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 139.单词拆分
 */
public class Test139 {

    public static void main(String[] args) {
        Test139 test139 = new Test139();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("codee");
        wordDict.add("rs");
        System.out.println(test139.wordBreak("leetcode", wordDict));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        for(String sub:wordDict){
            if(s.startsWith(sub)){
                if(sub.length()==s.length()){
                    return true;
                }
                String ss = new String(s.substring(sub.length()));
                boolean b = wordBreak(ss, wordDict);
                if(b==false){
                    continue;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    public boolean wordBreak1(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&wordDictSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}
