package com.shivanshu.practice;

public class IsNumberPrime {

    private static boolean isPrimeNumberRecursion(int num, int startIndex){
        if(num<=1) return false;
        if(num==2) return true;
        if (num % startIndex == 0) return false;
        if (startIndex* startIndex > num) return true;
        return isPrimeNumberRecursion(num,startIndex+1);
    }

    private static boolean isPrimeNumber(int num){
        if(num <=1) return false;

        for(int i =2 ; i*i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
