package com.example.algorithm.leetcode;

import java.util.*;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号
 */
public class Test20 {

    public static void main(String[] args) {
        String s = "([])";
        Test20 test = new Test20();
        System.out.println( test.isValid1(s));
    }

    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Deque<Character> left_deque = new LinkedList<>();
        Deque<Character> righ_deque = new LinkedList<>();
        char[] c = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (int i = 0; i < c.length; i++) {
            if('('==c[i]||'{'==c[i]||'['==c[i]){
                left_deque.push(c[i]);
            }else if(')'==c[i]||'}'==c[i]||']'==c[i]){
                if(!left_deque.isEmpty()&&map.get(left_deque.peek()).equals(c[i])){
                    left_deque.pop();
                }else{
                    righ_deque.push(c[i]);
                    break;
                }
            }
        }
        if(left_deque.isEmpty()&&righ_deque.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean isValid1(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Deque<Character> deque = new LinkedList<>();
        char[] c = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for (int i = 0; i < c.length; i++) {
            if(map.containsKey(c[i])){
                if(!deque.isEmpty()&&map.get(c[i])==deque.peek()){
                    deque.pop();
                }else{
                    return false;
                }
            }else{
                deque.push(c[i]);
            }
        }
        return deque.isEmpty();
    }


}
