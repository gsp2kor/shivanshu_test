package com.shivanshu.practice;

public class StringCompression {

    private static String compressedTring(String input) {

        if(input.length()==1) return input+1;

        char[] chars = input.toCharArray();
        StringBuilder result = new StringBuilder();
        char temp = chars[0];
        int counter = 0;
        for (int i=1 ; i<input.length();i++){
            if(temp == chars[i]){
                counter++;
                continue;
            }

            result.append(temp).append(counter+1);
            temp = chars[i];
            counter =0;
        }
        return result.append(temp).append(counter+1).toString();
    }

}
