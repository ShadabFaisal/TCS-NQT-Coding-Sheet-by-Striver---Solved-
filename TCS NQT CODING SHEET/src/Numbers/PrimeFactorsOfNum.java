package Numbers;

import java.util.Scanner;

public class PrimeFactorsOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//primeFactors(n);
		primeFactor(n);
		sc.close();

	}
	public static void primeFactors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				if(isPrime(i)) {
				System.out.print(i+" ");
				}
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void primeFactor(int n) {
	    System.out.print("Prime Factors : ");
	    for (int i = 2; n > 1; i++) {

	      if (n % i == 0) {

	        while (n % i == 0) {

	          System.out.print(i + " ");
	          n = n / i;
	        }
	      }

	    }

	}
}
