package com.algos.AlgorithmsI;

public class QueueLinkedListStrings {
    /*Queue Linked-list implementation */
    private Node first, last;

    //Node inner class
    private class Node{
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(String item){
        Node intialLastNode = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()){
            first = last;
        }else{
            intialLastNode.next = last;
        }
    }

    public String dequeue(){
        String item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        return item;
    } 
}
