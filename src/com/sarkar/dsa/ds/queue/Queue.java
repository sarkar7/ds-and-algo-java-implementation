package com.sarkar.dsa.ds.queue;

public class Queue {

    private int[] arr;
    private int front, rear = -1;
    private int length;

    public Queue(int size) {
        if (size == 0) throw new RuntimeException("Queue size can't be zero");
        arr = new int[size];
    }

    public void enQueue(int data) {
        if (data == 0) throw new RuntimeException("Data can't be zero");

        rear = (rear + 1) % arr.length; //Making it circular
        if (front == rear && front != -1) {
            System.out.println("Queue is full!");
            return;
        } else {
            arr[rear] = data;
            if (front == -1) {
                front = rear;
            }
        }
    }

    public void deQueue() {
        if (front == -1) {
            throw new RuntimeException("Queue is empty!");
        } else if (front == rear && front != -1) {
            System.out.println("Queue is empty!");
            front = rear = -1;
        } else {
            arr[front++] = 0;
        }
    }

    public void printQueue() {
        if (front == rear) {
            System.err.println("Queue is empty!");
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
