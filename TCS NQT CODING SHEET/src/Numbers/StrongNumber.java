package Numbers;

import java.util.Scanner;

public class StrongNumber {

	//Krishnamurthy Number or Peterson Number  Ex: 145
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		checkStrong(n);
		sc.close();
	}
	
	public static void checkStrong(int n) {
		int m=n;
		int sum=0;
		
		while(n!=0) {
			int r=n%10;
			sum+=fact(r);
			n/=10;
		}
		
		if(sum==m) {
			System.out.println("Yes");
		}else {
		System.out.println("No");
		}
		
		
	}
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		
		return n*fact(--n);
	}

}
