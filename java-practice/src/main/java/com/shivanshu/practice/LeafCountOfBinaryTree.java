package com.shivanshu.practice;

public class LeafCountOfBinaryTree {

    private int getLeafCountOfBinaryTree(BinaryTreeNode node){
        if(node == null) return 0;
        if(node.left != null && node.right != null){
            return 1;
        }else {
            return getLeafCountOfBinaryTree(node.right) + getLeafCountOfBinaryTree(node.left);
        }
    }

}
