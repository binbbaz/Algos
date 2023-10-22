package com.algos.asymptotic;

import com.algos.AlgorithmsI.GenericStack;

public class Main {
    public static void main (String [] args){
        // Helper helperMethods = new Helper();
        // // String [] names =  {"nemo"};
        // // helperMethods.findNemo(names);// find Nemo is O(n) - linear time, Space complexity - O(1)

        // // char[] characterArray = {'a', 'b', 'c', 'd', 'e'};
        // // helperMethods.logAllPairsofArray(characterArray); // O(n^2) - quadratic time

        // // int [] nums = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // // System.out.println(BinarySearch.BinarySearchInt(nums, 0));

        GenericStack<Integer> myStack = new GenericStack<Integer>();  
        myStack.push(25);
        myStack.push(45);
        myStack.push(55);
        System.out.println(myStack.pop());
    } 
}
