package com.example.algorithm.leetcode;

/**
 * 226.翻转二叉树
 */
public class Test226 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
