package com.sarkar.dsa.ds.list.linkedlist;

//Making this class default to make it this package private only
class LL_Node<T> {
    private T value;
    private LL_Node next;

    public LL_Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LL_Node getNext() {
        return next;
    }

    public void setNext(LL_Node next) {
        this.next = next;
    }
}
