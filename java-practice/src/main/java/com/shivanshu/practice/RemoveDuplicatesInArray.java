package com.shivanshu.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicatesInArray {

    private static int[] removeDuplicatesJava8(int[] sortedArray){
        return IntStream.of(sortedArray).distinct().sorted().toArray();
    }

    private static int[] removeDuplicatesModifyInputArray(int[] sortedArray){

        int i = 0;
        for (int j = 1; j < sortedArray.length; j++) {
            if(sortedArray[j] != sortedArray[i]){
                i++;
                sortedArray[i] = sortedArray[j];
            }
        }
        return Arrays.copyOfRange(sortedArray,0,i+1);
    }

    private static int[] removeDuplicatesNotModifyingInput(int[] sortedArray){
        int[] resultArr = new int[sortedArray.length];
        resultArr[0] = sortedArray[0];
        int i = 0;
        for (int j = 1; j < sortedArray.length; j++) {
            if(resultArr[i] != sortedArray[j]){
                i++;
                resultArr[i] = sortedArray[j];
            }
        }
        return Arrays.copyOfRange(resultArr,0,i+1);
    }

    private static int[] removeDuplicatedElement(int[] sortedArray){

        int i = 0;
        int j = 0;
        while(j<sortedArray.length){
            if(sortedArray[j] == sortedArray[j+1]){
                int temp = sortedArray[j];
                while (j<sortedArray.length && sortedArray[j] == temp){
                    j++;
                }
            }else {
                sortedArray[i++] =  sortedArray[j++];
            }

        }
        return Arrays.copyOfRange(sortedArray,0,i);
    }

    private static int[] removeElement(int[] sortedArray, int val){

        int i = 0;
        for (int j = 0; j < sortedArray.length; j++) {
            if(sortedArray[j] != val){
                sortedArray[i] = sortedArray[j];
                i++;
            }
        }
        return Arrays.copyOfRange(sortedArray,0,i);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicatesJava8(new int[]{-1,-1,0,0,2,3,3,4,7,9,9,13,15,15,15,15,15,15})));
        System.out.println(Arrays.toString(removeDuplicatesModifyInputArray(new int[]{-1,-1,0,0,2,3,3,4,7,9,9,13,15,15,15,15,15,15})));
        System.out.println(Arrays.toString(removeDuplicatesNotModifyingInput(new int[]{-1,-1,0,0,2,3,3,4,7,9,9,13,15,15,15,15,15,15})));
        System.out.println(Arrays.toString(removeDuplicatedElement(new int[]{-1,-1,0,0,2,3,3,4,7,9,9,13,15,15,15,15,15,15})));
        System.out.println(Arrays.toString(removeElement(new int[]{-1,-1,0,0,2,3,3,4,7,9,9,13,15,15,15,15,15,15},15)));
    }
}
