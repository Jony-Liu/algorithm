package com.example.algorithm.leetcode;

/**
 * 543.二叉树的直径
 */
public class Test543 {

    public static void main(String[] args) {

    }

    int ans ;
    public int diameterOfBinaryTree(TreeNode root) {
        ans =  1;
        depth(root);
        return ans - 1;

    }

    //计算深度
    public int depth(TreeNode node){
        if(node==null){
            return 0;
        }
        int l = depth(node.left);
        int r = depth(node.right);
        ans = Math.max(ans, l + r + 1);
        return Math.max(l,r) + 1;
    }

}
