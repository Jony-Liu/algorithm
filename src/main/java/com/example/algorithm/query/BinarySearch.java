package com.example.algorithm.query;

import java.util.Scanner;

/**
 * @author Jony-Liu
 */
public class BinarySearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1,2,3,4,5,6};
        System.out.println("请输入你要查询的数：");
        Scanner in = new Scanner(System.in);
        int search = in.nextInt();
        in.close();
        int high=arr.length-1;
        int low =0;
        int middle=0;
        int index=-1;
        while(low<=high){
            middle=(low+high)/2;
            if(arr[middle]==search){
                index=middle;
                break;
            }else if(arr[middle]<search){
                low=middle+1;
            }else{
                high=middle-1;
            }
        }
        if(index!=-1){
            System.out.println("下标："+index);
        }else{
            System.out.println("没找到撒");
        }
    }

}
