package com.sarkar.dsa.ds.stack;

public class StackByArray {

    private static final int MAX = 1000;
    private int top;
    private int a[] = new int[MAX]; // Maximum size of Stack

    public boolean isEmpty() {
        return (top < 0);
    }

    public StackByArray() {
        top = -1;
    }

    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

}
