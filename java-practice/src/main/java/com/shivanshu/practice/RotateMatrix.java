package com.shivanshu.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] inputArr = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        System.out.println("\nMatrix before \n");
        printMatrix(inputArr);
        rotateMatrixClockwise(inputArr);
        System.out.println("\nMatrix After \n");
        printMatrix(inputArr);

    }

    private static void rotateMatrixClockwise(int[][] inputArr) {
        int length = inputArr.length;
        for (int i = 0; i < length/2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                int temp = inputArr[i][j];
                inputArr[i][j] = inputArr[length-1-j][i];
                inputArr[length-1-j][i] = inputArr[length-1-i][length-1-j];
                inputArr[length-1-i][length-1-j] = inputArr[j][length-1-i];
                inputArr[j][length-1-i] = temp;
            }
        }
    }

    private static void printMatrix(int[][] inputArr) {
        int length = inputArr.length;

        Arrays.stream(inputArr).forEach(ints -> {
            IntStream.range(0, length).mapToObj(j -> ints[j] + " ").forEach(System.out::print);
            System.out.println();
        });
    }
}
