package com.shivanshu.practice;

import java.util.Stack;

public class PrintStackInReverse {

    private static void printStackReverseRecursion(Stack<Integer> stack){

        if(stack.isEmpty()){
            return;
        }

        int temp = stack.pop();

        printStackReverseRecursion(stack);

        System.out.println(temp + " ");

        stack.push(temp);

    }

    private static void printStackReverseIterative(Stack<Integer> stack){

    Stack<Integer> tempStack = new Stack<>();

    while(!stack.isEmpty())
        tempStack.push(stack.pop());

    while (!tempStack.isEmpty()){
        System.out.println(tempStack.peek());
        stack.push(tempStack.pop());
    }

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Recursive Solution");
        printStackReverseRecursion(stack);
        System.out.println("Interative Solution");
        printStackReverseIterative(stack);
    }
}
