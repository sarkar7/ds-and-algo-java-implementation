package com.sarkar.dsa.ds.linkedlist;

public class LinkedList implements List{

    private LL_Node head = null;
    private LL_Node tail = null;

    // Insert nodes in a link list
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

    // Insert a node at the beginning of a List
    public void insertAtBeginning(int value) {
        LL_Node newNode = new LL_Node(value);
        if (head != null) {
            newNode.setNext(head);
            head = newNode;
        } else {
            System.out.println("List is empty");
        }
    }

    // Insert a node at any point of a List
    @Override
    public void insertAt(int index, int value) {
        LL_Node newNode = new LL_Node(value);
        LL_Node current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.getNext();
            i++;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    // Delete node from any point of a List
    @Override
    public void deleteAt(int index) {
    }

    // Delete head
    public void deleteHead() {
    }

    // Delete Tail
    public void deleteTail() {
    }

    // Check if given data is available in the List or not
    @Override
    public boolean isAvailable(int e) {
        LL_Node currentNode = head;
        boolean flag = false;
        if (currentNode != null) {
            while (currentNode != null && flag == false) {
                flag = currentNode.getValue() == e ? true : false;
                currentNode = currentNode.getNext();
            }
        } else {
            System.out.println("LinkedList is empty");
        }
        return flag;
    }

    // Find size of the list
    @Override
    public int size() {
        LL_Node currentNode = head;
        int counter = 0;
        if (currentNode != null) {
            while (currentNode != null) {
                counter++;
                currentNode = currentNode.getNext();
            }
        }
        return counter;
    }

    // Display the link list
    @Override
    public void display() {
        LL_Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

}
