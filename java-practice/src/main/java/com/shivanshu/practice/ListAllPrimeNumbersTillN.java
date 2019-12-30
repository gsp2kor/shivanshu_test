package com.shivanshu.practice;

import java.util.Arrays;

public class ListAllPrimeNumbersTillN {
    public static void main(String[] args) {
        int n = 15;
        printPrimeNumber(n);
    }

    private static void printPrimeNumber(int number) {

        boolean[] prime = new boolean[number + 1];
        Arrays.fill(prime, true);

        int i = 2;
        while (i * i < number) {
            if (prime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    prime[j] = false;
                }
            }
            i++;
        }

        for(int k = 2; k <=number; k++)
        {
            if(prime[k])
                System.out.print(k + " ");
        }
    }



}
