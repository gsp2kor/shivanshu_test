package com.shivanshu.practice;

public class PrintMatrixInSpiralForm {

 public static void main(String[] args) {
  new PrintMatrixInSpiralForm();
 }

 private PrintMatrixInSpiralForm() {
  int[][] matrix = {
          {1, 2, 3, 4, 5},
          {6, 7, 8, 9, 10},
          {11, 12, 13, 14, 15},
          {16, 17, 18, 19, 20},
          {21, 22, 23, 24, 25}
  };

  printMatrixInSpiralWay(matrix);
  System.out.println();
  printMatrixInSpiralWayRecursive(matrix,0,matrix.length,0,matrix[0].length);
 }

 private void printMatrixInSpiralWay(int[][] matrix) {
   int row_length = matrix.length;
   int row_start = 0;
   int column_length = matrix[0].length;
   int column_start = 0;

   while(row_start<row_length && column_start<column_length){

    for (int i = column_start; i < column_length ; i++) {
     System.out.print(matrix[row_start][i] + " ");
    }

    for (int i = row_start+1; i < row_length ; i++) {
     System.out.print(matrix[i][column_length-1]  + " ");
    }

    if(column_start<column_length-2) {
     for (int i = column_length-2; i >= column_start; i--) {
      System.out.print(matrix[row_length-1][i]  + " ");
     }
    }

    if(row_start<row_length-2) {
     for (int i = row_length-2; i > row_start; i--) {
      System.out.print(matrix[i][column_start]  + " ");
     }
    }
    row_start++;
    row_length--;
    column_start++;
    column_length--;
   }
 }

 private void printMatrixInSpiralWayRecursive(int[][] matrix,int row_start , int row_length, int column_start, int column_length) {


   for (int i = column_start; i < column_length ; i++) {
    System.out.print(matrix[row_start][i] + " ");
   }

   for (int i = row_start+1; i < row_length ; i++) {
    System.out.print(matrix[i][column_length-1]  + " ");
   }

    for (int i = column_length-2; i >= column_start; i--) {
     System.out.print(matrix[row_length-1][i]  + " ");
    }

    for (int i = row_length-2; i > row_start; i--) {
     System.out.print(matrix[i][column_start]  + " ");
    }


    if(row_start<row_length-2 && column_start<column_length){
     printMatrixInSpiralWayRecursive(matrix,row_start+1,row_length-1,column_start+1,column_length-1);
    }
  }

}