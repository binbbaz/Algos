package com.algos.AlgorithmsI;

public class GenericStack<Item>{
    
    private Node first = null;

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(Item item){
        Node initialFirstItem = first;
        first = new Node();
        first.item = item;
        first.next = initialFirstItem; 
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        return item;
    }
}
