package com.algos.asymptotic;

public class Main {
    public static void main (String [] args){
        Helper helperMethods = new Helper();
        String [] names =  {"nemo"};
        helperMethods.findNemo(names);// find Nemo is O(n) - linear time, Space complexity - O(1)

        char[] characterArray = {'a', 'b', 'c', 'd', 'e'};
        helperMethods.logAllPairsofArray(characterArray); // O(n^2) - quadratic time
    } 
}
