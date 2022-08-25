package sarkar.dsa.algo.sorting;

public class SwapSort {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 6, 5 };
		swapSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void swapSort(int[] arr) {
		int i = 0;
		while (arr.length > i) {
			if (arr[i] == i + 1) {
				i++;
				continue;
			} else {
				int temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
			}
		}
	}

}
