package com.shivanshu.practice;

public class MaximumElementOfBinaryTree {

    private static int findMaxElementOfBinaryTree(BinaryTreeNode node){

        int result = Integer.MIN_VALUE;
        if(node == null) return result;
        result = node.data;

        int leftResult = findMaxElementOfBinaryTree(node.left);
        int rightResult = findMaxElementOfBinaryTree(node.right);

        if(leftResult > result) result = leftResult;
        if(rightResult > result) result = rightResult;

        return result;
    }
}
