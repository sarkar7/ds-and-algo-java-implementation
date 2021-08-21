package com.sarkar.dsa.ds.linkedlist;

public class LL_Node {
    private int value;
    private LL_Node next;

    public LL_Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LL_Node getNext() {
        return next;
    }

    public void setNext(LL_Node next) {
        this.next = next;
    }
}
