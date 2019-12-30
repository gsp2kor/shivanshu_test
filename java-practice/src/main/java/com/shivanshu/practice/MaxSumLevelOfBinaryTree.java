package com.shivanshu.practice;

import java.util.*;

public class MaxSumLevelOfBinaryTree {

    private static int maxSumLevelOfBinaryTreeRecursive(BinaryTreeNode root){

        Map<Integer,Integer> levelSumMap = new HashMap<>();
        maxSumRecursive(root,levelSumMap,1);

        return levelSumMap.values().stream().max(Comparator.naturalOrder()).get();

    }

    private static void maxSumRecursive(BinaryTreeNode node, Map<Integer, Integer> levelSumMap, int level) {

        if(node == null) return;
        levelSumMap.merge(level,node.data,Integer::sum);

        maxSumRecursive(node.left,levelSumMap,level+1);
        maxSumRecursive(node.right,levelSumMap,level+1);
    }

    private static int maxSumLevelOfBinaryTreeInterative(BinaryTreeNode root){

        if(root == null) return 0;

        int maxSum = 0;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            int levelSum = 0;
            while(size>0){
                BinaryTreeNode currentNode = queue.remove();
                levelSum += currentNode.data;
                size--;
                if(currentNode.left != null) queue.add(currentNode.left);
                if(currentNode.right != null) queue.add(currentNode.right);
            }
            if(maxSum<levelSum) maxSum = levelSum;
        }
        return maxSum;
    }
}
