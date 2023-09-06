package com.algos.asymptotic;

public class Main {
    public static void main (String [] args){
        Helper helperMethods = new Helper();
        String [] names =  {"nemo"};
        helperMethods.findNemo(names);// find Nemo is O(n)

        char[] characterArray = {'a', 'b', 'c', 'd', 'e'};
        helperMethods.logAllPairsofArray(characterArray);
    } 
}
