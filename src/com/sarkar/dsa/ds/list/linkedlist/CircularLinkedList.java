package com.sarkar.dsa.ds.list.linkedlist;

import com.sarkar.dsa.ds.list.List;

public class CircularLinkedList<T> implements List<T> {

    private LL_Node<T> head = null;
    private LL_Node<T> tail = null;

    @SuppressWarnings("unchecked")
	@Override
	public boolean add(Object data) {
		LL_Node<T> newNode = new LL_Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
		return true;
	}
    

    public void circulate() {
        if (this.tail != null) {
            this.tail.setNext(this.head);
        } else {
            throw new RuntimeException("Linked List should have at least one node!");
        }
    }

    //@Override
    public void insertAt(int index, int value) {

    }

    //@Override
    public void deleteAt(int index) {

    }

    @Override
	public int isAvailable(Object date) {
		return 0;
	}

    //@Override
    public int size() {
        return 0;
    }

    //@Override
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


	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
