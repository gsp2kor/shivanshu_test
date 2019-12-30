package com.shivanshu.practice;

import java.util.TreeMap;

public class VerticalSumOfBinaryTree {

    public static void main(String[] args) {
        BinaryTreeNode root = null;
        TreeMap<Integer,Integer> levelSumMap = new TreeMap<>();
        printVerticalSumOfBinaryTree(root,levelSumMap,0);
        levelSumMap.forEach((key, value) -> System.out.println(value));
    }

    private static void printVerticalSumOfBinaryTree(BinaryTreeNode node, TreeMap<Integer, Integer> levelSumMap, int level) {
        if(node ==  null) return;

        printVerticalSumOfBinaryTree(node.left,levelSumMap,level-1);
        levelSumMap.merge(level,node.data,Integer::sum);
        printVerticalSumOfBinaryTree(node.right,levelSumMap,level+1);
    }
}
