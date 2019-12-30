package com.shivanshu.practice;

import java.util.LinkedList;
import java.util.Queue;

public class CountFullAndHalfNodeOfBinaryTree {

    private static void countFullAndHalfNodeOfBinaryTreeRecursive(BinaryTreeNode root) {
        int[] countFullAndHalfNodes = {0, 0};
        countFullAndHalfNodeRecursive(root, countFullAndHalfNodes);
        System.out.println("Full Nodes : " + countFullAndHalfNodes[0] +
                " Half Nodes " + countFullAndHalfNodes[1]);
    }

    private static void countFullAndHalfNodeRecursive(BinaryTreeNode node, int[] countFullAndHalfNodes) {

        if (node == null) return;
        countFullAndHalfNodeRecursive(node.left, countFullAndHalfNodes);
        countFullAndHalfNodeRecursive(node.right, countFullAndHalfNodes);

        if (node.left != null && node.right != null) countFullAndHalfNodes[0]++;
        if (node.left != null && node.right == null ||
                node.left == null && node.right != null) countFullAndHalfNodes[1]++;
    }

    private static void countFullAndHalfNodeOfBinaryTreeIterative(BinaryTreeNode root) {

        int[] countFullAndHalfNodes = {0, 0};
        if (root != null) {
            Queue<BinaryTreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryTreeNode currentNode = queue.remove();
                if (currentNode.left != null && currentNode.right != null) countFullAndHalfNodes[0]++;
                if (currentNode.left != null && currentNode.right == null ||
                        currentNode.left == null && currentNode.right != null) countFullAndHalfNodes[1]++;

                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right != null) queue.add(currentNode.right);

            }
        }

        System.out.println("Full Nodes : " + countFullAndHalfNodes[0] +
                " Half Nodes " + countFullAndHalfNodes[1]);
    }

}
