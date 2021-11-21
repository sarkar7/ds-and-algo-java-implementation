package com.sarkar.dsa.ds.stack;

public class StackByLinkedList<T> {
	private StackNode<T> root;
	private int size = 0;

	public boolean isEmpty() {
		return root == null;
	}

	public void push(T data) {
		StackNode<T> newNode = new StackNode<>(data);
		if (root == null) {
			root = newNode;
		} else {
			StackNode<T> temp = root;
			root = newNode;
			newNode.next = temp;
		}
		size++;
	}

	
	public T pop() {
		T popped = null;
		if (root == null) {
			System.out.println("Stack is Empty");
		} else {
			popped = root.data;
			root = root.next;
			this.size--;
		}
		return popped;
	}

	public T peek() {
		if (root == null) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return (T) root.data;
		}

	}

	public int size() {
		return this.size;
	}
	
	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;

		StackNode(T data) {
			this.data = data;
			this.next = null;
		}
	}
}
