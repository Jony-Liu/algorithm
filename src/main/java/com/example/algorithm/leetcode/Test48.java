package com.example.algorithm.leetcode;

import java.util.Arrays;

/**
 * 48.旋转图像
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 *
 */
public class Test48 {

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Test48 test = new Test48();
        test.rotate(matrix);
        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int row = 0; row< n/2; row++) {
            for (int col= 0; col < (n+1)/2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[n - col- 1][row];
                matrix[n-col-1][row] = matrix[n-row-1][n-col-1];
                matrix[n - row - 1][n - col - 1] = matrix[col][n - row - 1];
                matrix[col][n-row-1] = temp;
            }
        }
    }

}


