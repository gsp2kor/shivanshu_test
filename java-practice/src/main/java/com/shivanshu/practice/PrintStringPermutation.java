package com.shivanshu.practice;

public class PrintStringPermutation {

    private static void printPermutations(String input){
        printPermutations(input,"");
    }

    private static void printPermutations(String input, String prefix) {
        if(input.length()==0){
            System.out.print(prefix + " ");
        }else {
            for(int i =0; i < input.length();i++){
            String rem = input.substring(0,i)+input.substring(i+1);
            printPermutations(rem,prefix+input.charAt(i));
            }
        }

    }

    public static void main(String[] args) {
        printPermutations("abc");
        System.out.println();
        printPermutations("abcd");
        System.out.println();
        printPermutations("abca");
        System.out.println();
        printPermutations("ab");
    }
}
