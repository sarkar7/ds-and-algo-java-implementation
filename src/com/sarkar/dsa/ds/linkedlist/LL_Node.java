package com.sarkar.dsa.ds.linkedlist;

public class LL_Node {
    private Object value;
    private LL_Node next;

    public LL_Node(Object value) {
        this.value = value;
        this.next = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public LL_Node getNext() {
        return next;
    }

    public void setNext(LL_Node next) {
        this.next = next;
    }
}
