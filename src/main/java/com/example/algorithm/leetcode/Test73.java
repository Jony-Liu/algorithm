package com.example.algorithm.leetcode;

import java.util.Arrays;

/**
 * 73.矩阵置零
 * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 */
public class Test73 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        Test73 test = new Test73();
        test.setZeroes(matrix);
    }

    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];//行
        boolean[] column = new boolean[matrix[0].length];//列
        for (int i = 0; i < matrix.length; i++) {
            int[] son = matrix[i];
            for (int j = 0; j < son.length; j++) {
                if(son[j]==0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if(row[i]){
                for (int j = 0; j <column.length ; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < column.length; i++) {
            if(column[i]){
                for (int j = 0; j < row.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
//        System.out.println(matrix.length);
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }

    }

}
