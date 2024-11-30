package Numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int m=n;
		do {
			int r=n%10;
			rev=(rev*10)+r;
			n/=10;
		}while(n>0);
		
		if(rev==m) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
		sc.close();
	}

}
