package com.shivanshu.practice;

public class CommonElementsIn2SortedArray {
    public static void main(String args[]) {

        int[] input1 = {2,7,7,17,19,20,20,45,56,159,239};
//        int[] input1 = {2};
        int[] input2 = {7,7,12,15,19,20,20,22,34,55,150,159,239};
//        int[] input2 = {2};
        int index1 = 0;
        int index2 = 0;
        int lastCommonElement = Math.min(input1[0],input2[0])-1;

        while(index1<input1.length && index2<input2.length){
            if(input1[index1] == input2[index2] && lastCommonElement != input1[index1]){
                System.out.println(input1[index1]);
                lastCommonElement = input1[index1];
                index1++;
                index2++;
            }else if(input1[index1] < input2[index2]){
                index1++;
            }else {
                index2++;
            }
        }

    }
}
