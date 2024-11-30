package Numbers;

public class LCM {

	public static void main(String[] args) {

	int n1=8,n2=24;
	
	int gcd=gcd(n1,n2);
	int lcm=(n1*n2)/gcd;
	
	System.out.println(lcm);
	}
	public static int gcd(int n1, int n2) {

		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = rem;
			n2 = n1;
		}
		return n2;
	}


}
