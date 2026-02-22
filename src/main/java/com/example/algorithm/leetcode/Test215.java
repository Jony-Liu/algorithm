package com.example.algorithm.leetcode;

import com.google.protobuf.Enum;

public class Test215 {
    public static void main(String[] args) {
        Test215 test = new Test215();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        test.findKthLargest(nums, k);
    }

    public int findKthLargest(int[] nums, int k) {
        return myHeapSort(nums, k);
    }

    public static int myHeapSort(int[] arr,int k) {
        int i;
        int len = arr.  length;
        for (i = len / 2 - 1; i >= 0; i--) {//依次建堆
            adjustment(arr,i,len);//以i为根节点，建立堆
        }
        for(i = len - 1;i>=0;i--){
            int tmp = arr[0];
            arr[0]=arr[i];
            arr[i]=tmp;
            k--;
            if(k==0){
                return tmp;
            }
            adjustment(arr,0,i);
        }
        return 0;
    }

    public static void adjustment(int[] arr,int pos,int len){
        int child = 2 * pos + 1;
        if(child+1<len&&arr[child]<arr[child+1]){
            child++;
        }
        if(child<len&&arr[pos]<arr[child]){
            int tmp = arr[pos];
            arr[pos] = arr[child];
            arr[child] = tmp;
            adjustment(arr,child,len);
        }
    }

}
