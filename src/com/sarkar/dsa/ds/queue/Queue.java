package com.sarkar.dsa.ds.queue;

public class Queue {

    private final int[] arr;
    private int front = -1, rear = -1;
    private int length = 0;

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public boolean isEmpty() {
        return length == arr.length;
    }

    public boolean isFull() {
        return arr.length == length;
    }

    public Queue(int size) {
        if (size == 0) throw new RuntimeException("Queue size can't be zero");
        arr = new int[size];
    }

    public int enQueue(int data) {
        if (data == 0) throw new RuntimeException("Data can't be zero");
        if (isFull()) {
            System.err.println("Queue is full!");
            return 0;
        }

        rear = (rear + 1) % arr.length;
        if (arr[rear] == 0) {
            arr[rear] = data;
            length++;
            if (front == -1) {
                front++;
            }
        }

        return data;
    }


    public int deQueue() {
        int temp = 0;
        if (front != rear) {
            temp = arr[front];
            arr[front] = 0;
            length--;
            front++;
        }
        return temp;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.err.println("Queue is empty!");
        }

        if (rear == arr.length) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int j = front; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }

            for (int k = 0; k < front; k++) {
                System.out.print(arr[k] + " ");
            }
        }

        System.out.println();
    }

}
