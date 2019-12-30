package com.shivanshu.practice;

import java.util.Arrays;

/*
* Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p
If such an integer is found return 1 else return -1.
* */
public class NobelInteger {

    public int solve(int[] inputArr) {
        Arrays.sort(inputArr);
        for(int i = 0 ;i<inputArr.length;i++){
            while(i<inputArr.length-1 && inputArr[i] == inputArr[i+1]){
                i++;
            }
            if(inputArr[i] == inputArr.length-i-1){
                return 1;
            }
        }
        return -1;
    }
}
