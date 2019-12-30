package com.shivanshu.practice;

import java.util.Arrays;

public class MaxSubArrayOfLengthK {

    private static int[] maxSubArrayOfLengthK(int[] inputArr , int k){
        int[] res = new int[k];
        int start = 0;
        for (int i = 0; i <= inputArr.length - k; i++) {
            for (int j = 0; j < k; j++) {
                if (inputArr[i + j] > inputArr[start + j]) {
                    start = i;
                    //System.out.println(start);
                    break;
                }
            }
        }
        System.arraycopy(inputArr, start, res, 0, k);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSubArrayOfLengthK(new int[]{1,1,4,5,5},3)));
    }
}
