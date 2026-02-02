package com.example.algorithm.leetcode;

/**
 * 74.搜索二维矩阵
 * 给你一个满足下述两条属性的 m x n 整数矩阵：
 * 每行中的整数从左到右按非严格递增顺序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
 */
public class Test74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        Test74 test = new Test74();
        System.out.println(test.searchMatrix(matrix,target));
    }

    public boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] merge = new int[n * m];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                merge[index] = matrix[i][j];
                index++;
            }
        }
        //对merge 进行二分查找
        int length = m*n;
        int left = 0 ;
        int right = length - 1;
        while(left<=right){
            int middel = (right+left)/2;
            if(merge[middel]==target){
                return true;
            }else if (merge[middel]>target){
                right = middel - 1;
            }else if(merge[middel]<target){
                left = middel+1;
            }
        }
        return false;
    }

}
