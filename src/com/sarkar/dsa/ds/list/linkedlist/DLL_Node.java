package com.sarkar.dsa.ds.list.linkedlist;

// Making this class default to make it this package private only
class DLL_Node {

    private Integer data;
    private DLL_Node prev;
    private DLL_Node next;

    public DLL_Node (Integer data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public DLL_Node getPrev() {
        return prev;
    }

    public void setPrev(DLL_Node prev) {
        this.prev = prev;
    }

    public DLL_Node getNext() {
        return next;
    }

    public void setNext(DLL_Node next) {
        this.next = next;
    }
}
