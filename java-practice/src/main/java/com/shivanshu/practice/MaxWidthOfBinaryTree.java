package com.shivanshu.practice;

import java.util.*;

public class MaxWidthOfBinaryTree {

    public static void main(String[] args)
    {
        BinaryTreeNode root = new BinaryTreeNode(15);
        root.left = new BinaryTreeNode(10);
        root.right = new BinaryTreeNode(20);
        root.left.left = new BinaryTreeNode(8);
        root.left.right = new BinaryTreeNode(12);
        root.right.left = new BinaryTreeNode(16);
        root.right.right = new BinaryTreeNode(25);

        System.out.println(maxWidthIterative(root));
        System.out.println(maxWidthRecursive(root));
    }

    private static int maxWidthRecursive(BinaryTreeNode root) {
        Map<Integer, Integer> map =  new HashMap<>();
        getMaxWidth(root,map,1);
        return map.values().stream().max(Comparator.naturalOrder()).get();
    }

    private static void getMaxWidth(BinaryTreeNode root, Map<Integer, Integer> map, int level) {

        if(root == null) return;

        map.merge(level, 1, Integer::sum);

        getMaxWidth(root.left,map,level+1);
        getMaxWidth(root.right,map,level+1);
    }

    private static int maxWidthIterative(BinaryTreeNode root) {
        int maxWidth = 0;

        if(root == null ) return 0;

        BinaryTreeNode current = null;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int width = queue.size();

            if(maxWidth < width){
                maxWidth = width;
            }

            while(width > 0){
                current = queue.poll();
                if(current == null) continue;
                if(current.left != null){
                   queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
                width--;
            }
        }

        return maxWidth;

    }


}