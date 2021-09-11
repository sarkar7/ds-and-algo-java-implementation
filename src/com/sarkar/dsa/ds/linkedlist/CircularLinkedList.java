package com.sarkar.dsa.ds.linkedlist;

public class CircularLinkedList implements List {

    private LL_Node head = null;
    private LL_Node tail = null;

    @Override
    public void add(int data) {
        LL_Node newNode = new LL_Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public void circulate() {
        if (this.tail != null) {
            this.tail.setNext(this.head);
        } else {
            throw new RuntimeException("Linked List should have at least one node!");
        }
    }

    @Override
    public void insertAt(int index, int value) {

    }

    @Override
    public void deleteAt(int index) {

    }

    @Override
    public boolean isAvailable(int e) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void display() {
        LL_Node temp = head;
        if (head != null)
        {
            do {
                System.out.print(temp.getValue() + " ");
                temp = temp.getNext();
            }
            while (temp != tail);
        }
    }
}
