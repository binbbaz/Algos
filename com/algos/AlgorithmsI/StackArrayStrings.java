package com.algos.AlgorithmsI;

public class StackArrayStrings {
    private String [] s;
    private int N = 0;

    public void FixedSizeOfStackStrings(int size){
        s = new String[size];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(String item){
        s[N++] = item;
    }

    public String pop(){
        String item = s[--N];
        s[N] = null;
        return item;
    }

    /*
     * the above will be  expensive if we are dealing with 
     * large amount of data becuase we need to specify the size of the array. 
     * What we can do is to create a new array  of twice the size and copy
     * the items if the array is full
     * 
     * public void FixedSizeOfStackStrings(int size){
     * if(N == s.length){
     *  resize (2 * s.length);
     * }
     * s[N++] = item;
     * }
     */

     private void resize(int size){
        String [] copy = new String[size];
        for (int i = 0; i < N; i++){
            copy[i] = s[i];
            s= copy;
        }
     }

     /*Shrinking array: halve size of array s[] when array is one-quarter full
        public String pop(){
        String item = s[--N];
        s[N] = null;
        if(N > 0 && N == s.length/4) resize(s.length/2);
        return item;
        } 
     */
}
