package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 234.回文链表
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class Test234 {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
        }
        temp = head;
        for (int i = list.size() - 1; i >=0; i--) {
            if(list.get(i).val != temp.val){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

}
