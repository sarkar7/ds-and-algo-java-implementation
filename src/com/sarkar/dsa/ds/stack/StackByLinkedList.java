package com.sarkar.dsa.ds.stack;

public class StackByLinkedList {
    private StackNode root;

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }


    }

    private static class StackNode {
        private int data;
        private StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }
}
