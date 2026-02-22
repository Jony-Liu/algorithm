package com.example.algorithm.leetcode;

/**
 * 21.合并两个有序链表
 */
public class Test21 {

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(list1!=null&&list2!=null){
                if(list1.val <= list2.val){
                    temp.next = list1;
                    temp = temp.next;
                    list1 = list1.next;
                }else{
                    temp.next = list2;
                    temp = temp.next;
                    list2 = list2.next;
                }
        }
        if(list2!=null){
            temp.next = list2;
        }else if(list1!=null){
            temp.next = list1;
        }
        return head.next;
    }

}
