package com.example.algorithm.leetcode;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 394.字符串解码
 */
public class Test394 {

    public static void main(String[] args) {

    }

    int ptr ;

    public String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<>();
        ptr = 0;

        while(ptr<s.length()){
            char cur = s.charAt(ptr);
            if(Character.isDigit(cur)){
                String digits = getDigit(s);
                stk.addLast(digits);
            }else if (Character.isLetter(cur)||cur=='['){
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            }else{
                ++ptr;
                LinkedList<String> sub = new LinkedList<>();
                while(!"[".equals(stk.peekLast())){
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                //[ 出栈
                stk.removeLast();
                int repTime = Integer.parseInt(stk.removeLast());
                String subStr = getString(sub);
                StringBuffer t = new StringBuffer();
                while(repTime-- > 0 ){
                    t.append(subStr.toString());
                }
                stk.addLast(t.toString());
            }
        }
        return getString(stk);
    }

    public String getDigit(String s){
        StringBuffer buffer = new StringBuffer();
        while(Character.isDigit(s.charAt(ptr))){
            buffer.append(s.charAt(ptr++));
        }
        return buffer.toString();
    }

    public String getString(LinkedList<String> list){
        StringBuffer buffer = new StringBuffer();
        for(String s : list){
            buffer.append(s);
        }
        return buffer.toString();
    }

}
