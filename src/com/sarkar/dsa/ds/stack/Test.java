package com.sarkar.dsa.ds.stack;

public class Test {

	public static void main(String[] args) {
		
		
		//StackByLinkedList<String> stack = new StackByLinkedList<>();
		StackByArray<String> stack = new StackByArray<>();
		stack.push("Sourabh");
		stack.push("Sarkar");
		
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		stack.push("Rahul");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		

	}

}
