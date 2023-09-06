package com.algos.asymptotic;

public class Helper {
    public void findNemo(String [] string){

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < string.length; i++){
            if (string[i].equals("nemo")){
            System.out.println("Found NEMO");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Call to fInd Nemo took " + (startTime - endTime) + " milliseconds");
    }

    public void logAllPairsofArray(char [] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }

}


