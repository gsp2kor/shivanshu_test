package com.shivanshu.practice;

public class FindPatternInInputString {

    private static void findPatternBaseApproach(String input , String pattern){

    }

    private static void findPatternOptimized(String input , String pattern){

        if(input == null || input.isEmpty()){
            System.out.println("Invalid input null or empty" );
            return;
        }

        if(pattern == null || pattern.isEmpty()){
            System.out.println("Invalid pattern : "+pattern + " for input -> ");
            return;
        }

        boolean found = false;
        int i = 0;
        System.out.println("Input  ----  "+ input+",  Pattern ---- "+pattern);
        while (i <= input.length() -pattern.length()) {
            int start_index = i;
            for (int j = 0; j < pattern.length() ; j++) {
                if(input.charAt(i)==pattern.charAt(j)){
                    i++;
                } else{
                    if(i==start_index){
                        i++;
                    }
                    break;
                }
                if(i-start_index == pattern.length()){
                    found = true;
                    System.out.println("Start index : "+ (start_index) + " End Index : "+ (--i));
                }
            }
        }


        if (!found){
            System.out.println( "Pattern : " + pattern + " not found in " + input);
        }

    }

    public static void main(String[] args) {

        findPatternOptimized("", null);
        findPatternOptimized("aaa", "aa");
        findPatternOptimized("ababcxabcabc", "abc");
        findPatternOptimized("ababcxabcabc", "zz");

    }
}
