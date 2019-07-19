package com.example.algorithm.rank;

import java.util.Arrays;

/**
 * 冒泡排序
 * 每次父循环将最大的数从下标为0的位置移动到 length-i-1 位置
 */
public class Bubbling {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr={2,6,4,8,9,5,12,55,89,45};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
