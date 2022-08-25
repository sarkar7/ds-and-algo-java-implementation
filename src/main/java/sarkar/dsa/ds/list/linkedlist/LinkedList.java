package sarkar.dsa.ds.list.linkedlist;

import sarkar.dsa.ds.list.List;

public class LinkedList<T> implements List<T> {

    private LL_Node<T> head = null;
    private LL_Node<T> tail = null;

    // Insert nodes in a link list
    public boolean add(T data) {
        LL_Node<T> newNode = new LL_Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;     
        return true;
    }

    // Insert a node at the beginning of a List
    public void insertAtBeginning(T value) {
        LL_Node<T> newNode = new LL_Node(value);
        if (head != null) {
            newNode.setNext(head);
            head = newNode;
        } else {
            System.out.println("List is empty");
        }
    }

    // Insert a node at any point of a List
    public void insertAt(int index, T value) {
        LL_Node<T> newNode = new LL_Node(value);
        LL_Node<T> current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.getNext();
            i++;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    // Delete node from any point of a List
    public void deleteAt(int index) {
    }

    // Delete head
    public void deleteHead() {
    }

    // Delete Tail
    public void deleteTail() {
    }

    // Check if given data is available in the List or not and return the index value
    public int isAvailable(T e) {
        LL_Node<T> currentNode = head;
        int index = -1;
        if (currentNode != null) {
            while (currentNode != null) {
                index = currentNode.getValue().equals(e) ? index + 1 : index;
                currentNode = currentNode.getNext();
            }
        } else {
            System.out.println("LinkedList is empty");
        }
        return index;
    }

    // Find size of the list
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

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
