package com.example.algorithm.rank;

import java.util.Arrays;

/**
 * 堆排序
 *
 * @author jonyliu
 * @date 2022/9/29 16:38
 */
public class HeapSort {

    public static void myHeapSort(int[] arr) {
        int i;
        int len = arr.length;
        for (i = len / 2 - 1; i >= 0; i--) {
            adjustment(arr,i,len);
        }
        for(i = len - 1;i>=0;i--){
            int tmp = arr[0];
            arr[0]=arr[i];
            arr[i]=tmp;
            System.out.print(tmp+" ");
            adjustment(arr,0,i);
        }
    }

    public static void adjustment(int[] arr,int pos,int len){
        int child = 2 * pos + 1;
        if(child+1<len&&arr[child]>arr[child+1]){
            child++;
        }
        if(child<len&&arr[pos]>arr[child]){
            int tmp = arr[pos];
            arr[pos] = arr[child];
            arr[child] = tmp;
            adjustment(arr,child,len);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 8, 9, 5, 12, 55, 89, 45};
        System.out.println(Arrays.toString(arr));
        myHeapSort(arr);
    }

}
