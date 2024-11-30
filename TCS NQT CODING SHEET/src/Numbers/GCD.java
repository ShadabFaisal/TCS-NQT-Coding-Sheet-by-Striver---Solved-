package Numbers;

public class GCD {

	public static void main(String[] args) {

		int num1 = 52, num2 = 20;

		System.out.println(gcd(num1, num2));
		System.out.println(gcd2(num1, num2));

		/*
		 * int ans = 1; for (int i = 1; i <= Math.min(num1, num2); i++) { if (num1 % i==
		 * 0 && num2 % i == 0) { ans = i; } }
		 * System.out.print("The GCD of the two number is "+ans);
		 */

	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static int gcd2(int n1, int n2) {

		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = rem;
			n2 = n1;
		}
		return n2;
	}

}
