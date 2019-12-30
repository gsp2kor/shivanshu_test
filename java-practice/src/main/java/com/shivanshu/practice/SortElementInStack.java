package com.shivanshu.practice;

import java.util.Stack;

public class SortElementInStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(4);

        printSortedStack(sortStackIterative(stack));


        printSortedStack(sortStackRecursive(stack));
    }

    private static Stack<Integer> sortStackRecursive(Stack<Integer> stack) {

        if(!stack.isEmpty()){
            // Keep popping elements from the stack, so all the elements will be stored in temp
            int temp = stack.pop();
            // recursively call sortStackRecursive till the stack is empty
            sortStackRecursive(stack);
            //call method to sort and insert elements saved in temp variable, order will be reversed
            insertSortedElement(stack,temp);
        }
        return stack;
    }

    private static void insertSortedElement(Stack<Integer> stack, int temp) {
        // if stack is empty or stack contain element greater then incoming element,push into stack
        if(stack.isEmpty() || stack.peek() > temp){
            stack.push(temp);
        }else {
            // if stack contains element smaller than incoming temp
            // pop the smaller element from stack
            int popped = stack.pop();
            // call sorting method recursively passing the greater temp variable
            insertSortedElement(stack,temp);
            // add the smaller popped element
            stack.push(popped);
        }




    }

    private static Stack<Integer> sortStackIterative(Stack<Integer> stack) {

        // create a temp stack
        Stack<Integer> tempStack = new Stack<>();

        while(!stack.isEmpty()) {
            //pop en element
            int current = stack.pop();
            // iterate till tempStack has top element greater than the popped element from stack
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                // pop from tempStack and add to stack
                stack.push(tempStack.pop());
            }
            // push the smaller element into tempStack
            tempStack.push(current);
        }

        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }

        return stack;
        }



    private static void printSortedStack(Stack<Integer> stack) {
        if(stack.isEmpty()) return;
        int popped = stack.pop();
        System.out.println(popped);
        printSortedStack(stack);
        stack.push(popped);
    }
}

