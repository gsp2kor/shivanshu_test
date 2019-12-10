package com.shivanshu.practice;

public class CheckIfNumberIsPerfectSquare {

    private static boolean checkNumber(int num){
        if(num == 0 || num == 1){
            return true;
        }

        int left = 0;
        int right = num;

        while(left<right){
            int mid = (left+right)/2;

            if(num%mid == 0 && (mid*mid) == num){
                return true;
            }else if(mid<num/mid){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(16));
        System.out.println(checkNumber(26));
        System.out.println(checkNumber(32));
        System.out.println(checkNumber(121));
    }
}
