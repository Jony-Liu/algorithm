package com.example.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 142.环形链表II
 * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 */
public class Test142 {

    public static void main(String[] args) {

    }

    public ListNode hasCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.add(head)){
                return head;
            }
            head = head.next;
        }
        return null;
    }

}
