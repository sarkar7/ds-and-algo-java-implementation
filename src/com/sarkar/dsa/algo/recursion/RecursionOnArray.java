package com.sarkar.dsa.algo.recursion;

public class RecursionOnArray {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 8, 5, 1, 9, 4 };
		print(arr, 0);
		System.out.println();
		printInReverse(arr, 0);
		manipulateElements(arr, 0);
		System.out.println();
		print(arr, 0);
	}

	// It is affecting the original array
	private static void manipulateElements(int[] arr, int i) {
		if (i == arr.length - 1) {
			arr[i] += 1;
			return;
		}
		arr[i] += 1;
		manipulateElements(arr, i + 1);
	}

	private static void print(int[] arr, int i) {
		if (i == arr.length - 1) {
			System.out.print(arr[i] + " ");
			return;
		}
		System.out.print(arr[i] + " ");
		print(arr, i + 1);
	}

	private static void printInReverse(int[] arr, int i) {
		if (i == arr.length - 1) {
			System.out.print(arr[i] + " ");
			return;
		}
		printInReverse(arr, i + 1);
		System.out.print(arr[i] + " ");
	}

}
