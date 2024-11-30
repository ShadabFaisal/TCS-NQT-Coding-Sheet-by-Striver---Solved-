package Numbers;

import java.util.Scanner;

public class HarshadOrNivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHarshad(n));
		sc.close();
	}

	public static boolean isHarshad(int n) {
		int m = n;
		int divisor = 0;
		while (n != 0) {
			int r = n % 10;
			divisor += r;
			n /= 10;
		}
		if (m % divisor == 0)
			return true;

		return false;
	}

}
