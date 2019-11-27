package com.shivanshu.practice;

import java.util.Arrays;

public class Merge2SortedArrayWithDuplicates {

    private static int[] merge(int[] one,int[] two) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[one.length+two.length];

        while(i<one.length && j<two.length){
            // handle duplicates of array one
            if(k> 0 && result[k-1] == one[i]){
                i++;
                continue;
            }
            // handle duplicates of array two
            if(k> 0 && result[k-1] == two[j]){
                j++;
                continue;
            }
            if(one[i] > two[j]){
                result[k++] = two[j++];
            }else if(one[i]<two[j]){
                result[k++] = one[i++];
            }else {
                result[k++] = one[i++];
                j++;
            }

        }

        for(int x = i;x<one.length;x++){
            result[k++] = one[x];
        }

        for(int x = j;x<two.length;x++){
            result[k++] = two[x];
        }
        return Arrays.copyOfRange(result,0,k);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,4,7,9,9,13,15},new int[]{7,9,12,13,15,17,18,19,20})));
    }
}
