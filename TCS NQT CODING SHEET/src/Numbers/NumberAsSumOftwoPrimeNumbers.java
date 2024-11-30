package Numbers;

import java.util.Scanner;

public class NumberAsSumOftwoPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n));
		sc.close();
	}

	static boolean prime(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	static boolean isPrime(int n) {

		if (prime(n) && prime(n - 2)) {
			return true;
		} else {
			return false;
		}
	}

}
