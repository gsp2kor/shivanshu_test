package com.shivanshu.practice;

public class FindMinimumElementInRotatedSortedArray {

    private static int findMinimumElementInRotatedSortedArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left + 1 < right) {
            middle = left + (right - left) / 2;
            if (nums[middle] == nums[right]) {
                right--;
            } else if (nums[middle] > nums[right]) {
                left = middle;
            } else if (nums[middle] < nums[right]) {
                right = middle;
            }
        }
        return Math.min(nums[left], nums[right]);

    }

    public static void main(String[] args) {
        System.out.println(findMinimumElementInRotatedSortedArray(new int[]{3, 1, 3, 3}));
        System.out.println(findMinimumElementInRotatedSortedArray(new int[]{1}));
        System.out.println(findMinimumElementInRotatedSortedArray(new int[]{1, 2}));
        System.out.println(findMinimumElementInRotatedSortedArray(new int[]{1, 1, 1}));
        System.out.println(findMinimumElementInRotatedSortedArray(new int[]{3, 4, 1, 2}));
        System.out.println(findMinimumElementInRotatedSortedArray(new int[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}));
        System.out.println(findMinimumElementInRotatedSortedArray(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 3, 1, 1, 2}));
    }


}
