package com.shivanshu.practice;

import java.util.*;

public class MaxWidthOfBinaryTree {

    public static void main(String[] args)
    {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        System.out.println(maxWidthIterative(root));
        System.out.println(maxWidthRecursive(root));
    }

    private static int maxWidthRecursive(Node root) {
        Map<Integer, Integer> map =  new HashMap<>();
        getMaxWidth(root,map,1);
        return map.values().stream().max(Comparator.naturalOrder()).get();
    }

    private static void getMaxWidth(Node root, Map<Integer, Integer> map, int level) {

        if(root == null) return;

        map.merge(level, 1, Integer::sum);

        getMaxWidth(root.left,map,level+1);
        getMaxWidth(root.right,map,level+1);
    }

    private static int maxWidthIterative(Node root) {
        int maxWidth = 0;

        if(root == null ) return 0;

        Node current = null;

        Queue<Node> queue = new LinkedList<>();
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

class Node
{
    int key;
    Node left = null, right = null;

    Node(int key) {
        this.key = key;
    }
}