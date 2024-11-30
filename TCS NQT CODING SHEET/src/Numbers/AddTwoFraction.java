package Numbers;

public class AddTwoFraction {

	public static void main(String[] args) {
		int num1 = 3, den1 = 4, num2 = 1, den2 = 7, num3, den3;
		int lcm = (den1*den2)/gcd(den1, den2);
		den3 = lcm;
		num3 = num1 * (den3 / den1) + num2 * (den3 / den2);
		simplify(num3, den3);
		System.out.println(num1 + "/" + den1 + "+" + num2 + "/" + den2 + "=" + num3 + "/" + den3);
	}

	private static void simplify(int num3, int den3) {
		int gcd = gcd(num3, den3);
		num3 /= gcd;
		den3 /= gcd;

	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
