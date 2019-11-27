package com.shivanshu.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicatesInArray {

    private static int[] removeDuplicatesJava8(int[] sortedArray){
        return IntStream.of(sortedArray).distinct().sorted().toArray();
    }

    private static int[] removeDuplicatesModifyInputArray(int[] sortedArray){
        if(sortedArray == null) throw new RuntimeException("Array can't be null");
        if(sortedArray.length<2) return sortedArray;
        int i =1;
        int j =0;
        while(i<sortedArray.length){
            if(sortedArray[i] == sortedArray[j]){
                i++;
            }else {
                sortedArray[++j] = sortedArray[i++];
            }
        }
        return Arrays.copyOfRange(sortedArray,0,j+1);
    }

    private static int[] removeDuplicatesNotModifyingInput(int[] sortedArray){
        if(sortedArray == null) throw new RuntimeException("Array can't be null");
        if(sortedArray.length<2) return sortedArray;
        int i =1;
        int j =0;
        int[] result = new int[sortedArray.length];
        result[0] = sortedArray[0];
        while(i<sortedArray.length){
            if(sortedArray[i] == result[j]){
                i++;
            }else {
                result[++j] = sortedArray[i++];
            }
        }
        return Arrays.copyOfRange(result,0,j+1);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicatesJava8(new int[]{-1,-1,0,0,2,3,3,4,7,9,9,13,15,15,15,15,15,15})));
        System.out.println(Arrays.toString(removeDuplicatesModifyInputArray(new int[]{-1,-1,0,0,2,3,3,4,7,9,9,13,15,15,15,15,15,15})));
        System.out.println(Arrays.toString(removeDuplicatesNotModifyingInput(new int[]{-1,-1,0,0,2,3,3,4,7,9,9,13,15,15,15,15,15,15})));
    }
}
