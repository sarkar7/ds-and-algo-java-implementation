package com.sarkar.dsa.ds.list.linkedlist;

public class Runner {

    public static void main(String[] args) {

        /*
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        //list.print();
        */

        CircularLinkedList list = new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.circulate();
        list.display();

    }

}
