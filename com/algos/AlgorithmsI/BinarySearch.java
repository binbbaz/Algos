package com.algos.AlgorithmsI;

public class BinarySearch {

   public static int BinarySearchInt(int [] intArray, int target){
    int lowerBound = 0;
    int upperBound = intArray.length - 1;
    while(lowerBound <= upperBound){
        int mid = lowerBound + (upperBound - lowerBound)/2;
        if (target < intArray[mid]){
            upperBound = mid - 1;
        }else if (target > intArray[mid]){
            lowerBound = mid + 1;
        }else{
            return mid;
        }
    }
    return -1;
   }
}
