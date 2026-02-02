package com.example.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 141.环形链表
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 */
public class Test141 {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode l1 = new ListNode(1);
        List<ListNode> list = new ArrayList<>();
        list.add(l);
        System.out.println(list.get(0).hashCode());
        System.out.println(l.hashCode());
        System.out.println(l1.hashCode());
    }

    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
            if(temp!=null){
                if(list.contains(temp)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
