package com.shivanshu.practice;

import java.util.Arrays;

public class FindFirstAndLastIndexOfElementInSortedArray {
    private static int[] findIndexes(int[] nums , int target){

        int low =0;
        int high = nums.length;

        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]<target){
                low = mid+1;
            }else if(nums[mid]>target){
                high =mid;
            }else{
                return new int[]{getLeftIndex(nums,target,mid),getRightIndex(nums,target,mid)};
            }
        }
        return new int[]{-1,-1};
    }


    private static int getLeftIndex(int[] arr, int target, int mid) {
        while(mid>0 && arr[mid-1]==target){
            mid--;
        }
        return mid;
    }

    private static int getRightIndex(int[] arr, int target, int mid) {
        while(mid<arr.length-1 && arr[mid+1]==target){
            mid++;
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIndexes(new int[]{5,7,7,8,8,10},7)));
    }


}
