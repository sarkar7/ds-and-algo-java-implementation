package com.sarkar.dsa.ds.stack;

public class StackByArray<T> {

	private static final int MAX = 1000;
	private int top;
	private Object a[] = new Object[MAX]; // Maximum size of Stack
	private int size = 0;

	public boolean isEmpty() {
		return (top < 0);
	}

	public StackByArray() {
		top = -1;
	}

	public boolean push(T x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			// System.out.println(x + " pushed into stack");
			this.size++;
			return true;
		}
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return null;
		}
		this.size--;
		return (T) a[top--];
	}

	@SuppressWarnings("unchecked")
	public T peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return null;
		}
		return (T) a[top];
	}

	public int size() {
		return this.size;
	}

}
