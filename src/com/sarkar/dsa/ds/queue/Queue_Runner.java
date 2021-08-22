package com.sarkar.dsa.ds.queue;

public class Queue_Runner {

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        queue.printQueue();

        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());

        queue.enQueue(6);
        queue.printQueue();
        queue.enQueue(7);
        queue.printQueue();

        queue.enQueue(3);
        queue.enQueue(4);
        //queue.enQueue(5);

        System.out.println("Front " + queue.getFront());
        System.out.println("Rear " + queue.getRear());

        queue.printQueue();


    }
}
