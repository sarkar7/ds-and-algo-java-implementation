package sarkar.dsa.algo.dp;

import java.util.Arrays;

public class KadanesAlgo {
	
	public static void main(String[] args) {
		int[] arr = {-3, 10, -2, -7, 9, -2, -5};
		System.out.println(Arrays.toString(findRangeOfMaxSumContiguousSubArray(arr)));
	}

	public static int findMaxSumContiguousSubArray(int[] arr) {

		int max_ending_here = 0;
		int max_so_far = Integer.MIN_VALUE;

		if (arr.length == 0) {
			return 0;
		}

		for (int i = 0; i < arr.length; i++) {
			max_ending_here = max_ending_here + arr[i];

			if (max_ending_here < arr[i]) {
				max_ending_here = arr[i];
			}

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}

		}

		return max_so_far;
	}

	public static int[] findRangeOfMaxSumContiguousSubArray(int[] arr) {

		int max_ending_here = 0;
		int max_so_far = Integer.MIN_VALUE;
		int start = 0, end = 0;
		int beg = 0;

		for (int i = 0; i < arr.length; i++) {
			max_ending_here = max_ending_here + arr[i];

			if (max_ending_here < arr[i]) {
				max_ending_here = arr[i];
				beg = i;
			}

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = beg;
				end = i;
			}

		}

		return Arrays.copyOfRange(arr, start, end + 1);
	}

}
