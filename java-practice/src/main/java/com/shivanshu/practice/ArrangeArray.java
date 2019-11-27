package com.shivanshu.practice;

import java.util.Arrays;



/**
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
 *       Input : [1, 0]
 *       Return : [0, 1]
 *
 *       Input : [2, 1, 3, 0]
 *       Return :[3, 1, 0, 2]
 */
public class ArrangeArray {

    private static int[] arrangeArray(int[] inputArr){
        int length = inputArr.length;

        for (int i = 0; i < length ; i++) {
            inputArr[i] = inputArr[i] + (inputArr[inputArr[i]]%length)*length;
        }

        for (int i = 0; i < length ; i++) {
            inputArr[i] = inputArr[i]/length;
        }
        return inputArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrangeArray(new int[]{1,0})));
        System.out.println(Arrays.toString(arrangeArray(new int[]{2,1,3,0})));
    }
}
