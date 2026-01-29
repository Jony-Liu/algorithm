package com.example.algorithm.leetcode;

/**
 * 11.盛最多水的容器
 * @author jonyliu
 * @date 2025/9/22 15:13
 */
public class Test11 {


    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int max =  maxArea2(nums);
        System.out.println(max);

    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = 1;
        int max = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int product = 0;
                if(height[i]<height[j]){
                    product = height[i] * (j - i);
                    if(product>max){
                        max = product;
                    }
                }else {
                    product = height[j] * (j - i);
                    if(product>max){
                        max = product;
                    }
                }

            }
        }
        return max;
    }


    public static int maxArea2(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = 0;
        while(left!=right){
            int product = (right-left)*(height[left]>height[right]?height[right]:height[left]);
            if(product>max){
                max = product;
            }
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }

        return max;
    }

}
