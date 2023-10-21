package com.algos.AlgorithmsI;

public class StackLinkedListStrings{
    /*Stack Linked-list implementation */
    private Node first = null;

    //Node inner class
    private class Node{
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(String item){
        Node intialFirstNode = first;
        first = new Node();
        first.item = item;
        first.next = intialFirstNode;
    }

    public String pop(){
        String firstItem = first.item;
        first = first.next;
        return firstItem;
    }
}