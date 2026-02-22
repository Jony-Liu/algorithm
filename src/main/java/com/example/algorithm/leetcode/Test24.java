package com.example.algorithm.leetcode;

import com.example.algorithm.designmode.iterator.List;

/**
 * 24.两两交换链表中的节点
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class Test24 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,null);
        ListNode l2 = new ListNode(2,null);
        ListNode l3 = new ListNode(3,null);
        ListNode l4 = new ListNode(4,null);

        l1.next = l2 ;
        l2.next = l3;
        l3.next = l4;
        Test24 test = new Test24();
        test.swapPairs(l1);

    }

    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next ==null){
            return head;
        }
        ListNode result = null;
        ListNode top = new ListNode(0,head);
        ListNode first = top.next;

        while(first!=null&&first.next!=null){
            ListNode second = first.next;
            if(result == null){
                result = second;
            }
            if(second.next!=null){
                ListNode third = second.next;
                first.next = third;
                second.next = first;
                top.next = second;
                top = first;
                first = top.next;
            }else{
                first.next = null;
                second.next = first;
                top.next = second;
                break;
            }
        }
        return result;
    }

    public ListNode swapPairs1(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs1(newHead.next);
        newHead.next = head;
        return newHead;
    }

}
