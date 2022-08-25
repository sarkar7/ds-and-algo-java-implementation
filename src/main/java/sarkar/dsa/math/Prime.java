package sarkar.dsa.math;

public class Prime {

	public static void main(String[] args) {

		System.out.println(isPrime(12));

	}

	// Worst case time complexity O(n) - Not optimized approach
	private static boolean isPrimeIterative(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Worst case time complexity O(sqrt(n)) - Optimized approach
	public static boolean isPrime(long n) {
		for (long i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
