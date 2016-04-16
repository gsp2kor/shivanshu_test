package com.test.shivanshu;

public class FindSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] largeArray = {1,3,5};
        int[] subArray = {1};
        
        int result = findArray(largeArray,subArray);
        System.out.println(result);
        
        
    }
    
    public static int findArray(int[] array, int[] subArray) {

        
        if (array.length == 0 || subArray.length == 0 || array.length-subArray.length<0) {
            return -1;
        }
        
        int iteration = array.length - subArray.length;

int result = -1;
        for (int i = 0; i <= iteration; i++) {
            

                boolean subArrayFound = true;
                for (int j = 0; j < subArray.length; j++) {

                    if (array[i+j] != subArray[j]) {
                        subArrayFound = false;
                        break;
                    }
                }


                if (subArrayFound) {
                    result= i;
                }

            
        }
        return result;
    
   
}

}
