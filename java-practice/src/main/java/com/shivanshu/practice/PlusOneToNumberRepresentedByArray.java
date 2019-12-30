package com.shivanshu.practice;

import java.util.Arrays;

public class PlusOneToNumberRepresentedByArray {

    private static int[] plusOne(int[] digits) {
        int count = 0;
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
                count++;
                if(count == digits.length){
                    int[] arr = new int[digits.length+1];
                    arr[0] = 1;
                    return arr;
                }
            }
            else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
}
