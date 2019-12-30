package com.shivanshu.practice;
/*189. Rotate Array

Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Note:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArrayNoExtraSpace(new int[]{1,2,3,4,5,6,7,8},3)));
        System.out.println(Arrays.toString(rotateArrayWithExtraSpace(new int[]{1,2,3,4,5,6,7,8},3)));
    }

    private static int[] rotateArrayNoExtraSpace(int[] inputArr, int pos) {
        pos = pos%inputArr.length;
        int count = 0;
        for (int start = 0; count < inputArr.length ; start++) {
            int current  = start;
            int prev = inputArr[start];
            do {
                int next = (current+pos)%inputArr.length;
                int temp = inputArr[next];
                inputArr[next] = prev;
                prev = temp;
                current = next;
                count++;
            }while (start != current);

        }
        return inputArr;
    }

    private static int[] rotateArrayWithExtraSpace(int[] inputArr, int pos) {
        int[] resultArr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            resultArr[(i+pos)%inputArr.length] = inputArr[i];
        }
        return resultArr;
    }
}
