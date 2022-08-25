package sarkar.dsa.ds;

import java.util.*;

public class DS {

    public static void main(String[] args) {

        // ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // LinkedList & DoublyLinkedList
        List<Integer> likedList = new LinkedList<>();

        // Stack
        Stack<Integer> stack = new Stack<>();

        // Queue
        Queue<String> queue = new PriorityQueue<>();

        // Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        // Map
        Map<Integer, Integer> map = new HashMap<>();


    }

}
