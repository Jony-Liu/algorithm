package com.example.algorithm.rank;

import java.util.Arrays;

/**
 * 插入排序
 */
public class insertSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a={17,3,25,14,20,9};
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
