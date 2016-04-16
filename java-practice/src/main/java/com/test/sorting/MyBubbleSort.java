package com.test.sorting;

public class MyBubbleSort {

	
	public static void main (String args[]){
		
		int toBeSortedArray[] = {36 ,55, 23 ,72 ,96,234, 23};
		
		bubbleSort(toBeSortedArray);
		
	}

	private static void bubbleSort(int[] toBeSortedArray) {
		int length = toBeSortedArray.length;
		 
		for(int i=0; i<length-1;i++){
			
			for(int j=0; j<length-1;j++){
				
				if(toBeSortedArray[j] > toBeSortedArray[j+1]){
					
					int temp;
					temp = toBeSortedArray[j];
					toBeSortedArray[j] = toBeSortedArray[j+1];
					toBeSortedArray[j+1] = temp;
				}
				
			}
		}
		
		printSortedArray(toBeSortedArray);

		
	}

	private static void printSortedArray(int[] toBeSortedArray) {
		
		for(int num : toBeSortedArray){
			System.out.print(num + " ,");
		}
		
	}
}
