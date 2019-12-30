package com.shivanshu.practice;

import java.util.*;

public class SolveCubicEquation {

    private static List<String> solveCubicEquation() {

        List<String> result = new ArrayList<>();
        Map<Integer, List<Integer>> pairMap = new HashMap<>();

        for (int i = 1; i <= 32; i++) {
            for (int j = i+1; j <= 32; j++) {
                int sum = (i * i * i) + (j * j * j);
                if (pairMap.get(sum) == null) {
                    List<Integer> values = new ArrayList<>();
                    values.add(i);
                    values.add(j);
                    pairMap.put(sum, values);
                } else {
                    List<Integer> temp = pairMap.get(sum);
                    String res = "" + i + "+^3 + " + j + "^3 = " + temp.get(0) + "+^3 + " + temp.get(1) + "^3 = " + sum;
                    System.out.println(res);
                    result.add(res);
                }
            }
        }
        return result;
    }

    private static List<String> solveCubicEquationOptimize() {

        List<String> result = new ArrayList<>();
        Map<Integer, List<Integer>> pairMap = new HashMap<>();

        for (int i = 1; i <= 32; i++) {
            int sum1 = i * i * i;
            for (int j = i+1; j <= 32; j++) {
                int sum2 = j * j * j;

                for(int k = i+1;k<=32;k++){
                    int sum3 = k*k*k;
                    if(sum3>sum2+sum1)break;
                    for(int l = k; l<=32;l++){
                        int sum4 = l*l*l;
                        int sumFinal = sum4+sum3;
                        if(sum4+sum3==sum2+sum1){
                            String res = "" + i + "^3 + " + j + "^3 = " + k + "^3 + " + l + "^3 = " + sumFinal;
                            System.out.println(res);
                            result.add(res);
                        }

                    }
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        solveCubicEquation();
        solveCubicEquationOptimize();
    }

}
