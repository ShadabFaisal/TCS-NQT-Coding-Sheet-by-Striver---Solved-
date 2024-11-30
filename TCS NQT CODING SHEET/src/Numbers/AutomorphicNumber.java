package Numbers;

import java.util.Scanner;

public class AutomorphicNumber {
	
	//Ex: 76, 25
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(isAutomorphic(n)==true) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not an Automorphic Number");
		}
		sc.close();
	}
	public static boolean isAutomorphic(int n) {
		int sq=n*n;
		
		while(n>0) {
			if(n%10 != sq%10) {
				return false;
			}
			n/=10;
			sq/=10;
		}
		return true;
	}

}
