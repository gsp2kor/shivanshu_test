package com.shivanshu.practice;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {

    private   static int heightOfBinaryTreeRecursive(BinaryTreeNode root) {
        if(root == null)return 0;
        return Math.max(heightOfBinaryTreeRecursive(root.left),heightOfBinaryTreeRecursive(root.right))+1;
    }

    public  static int heightOfBinaryTreeIterative(BinaryTreeNode root) {
        if(root == null)return 0;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            height++;
            while (size>0){
                BinaryTreeNode current = queue.remove();
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
                size--;
            }
        }
        return height;
    }


}
