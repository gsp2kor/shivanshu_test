package com.shivanshu.practice;

public class ReverseInteger {

    private static int ReverseInteger(int number){
        int result = 0;
        while(number != 0){
            int remainder = number%10;
            number = number/10;

            if(result>(Integer.MAX_VALUE/10) ||(result == Integer.MAX_VALUE/10 && remainder > 7)){
                return 0;
            }

            if(result<(Integer.MIN_VALUE/10) ||(result == Integer.MIN_VALUE/10 && remainder < -8)){
                return 0;
            }


            result = result*10+remainder;
        }
        return result;
    }
}
