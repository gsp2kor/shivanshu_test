package com.shivanshu.practice;

public class ExcelColumn {

    private static int titleToNumber(String title){
        int length = title.length();
        int result=0;
        while(length>0){
            result += Math.pow(26,length-1)*(title.charAt(title.length()-length)-64);
            length--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AA"));
        System.out.println(titleToNumber("AAA"));
    }
}
