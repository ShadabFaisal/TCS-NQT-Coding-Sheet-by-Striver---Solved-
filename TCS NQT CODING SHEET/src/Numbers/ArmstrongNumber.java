package Numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int m=n;
		
		do {
			int r=n%10;
			n/=10;
			sum+=Math.pow(r, 3);
		}while(n>0);
		
		if(sum==m) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		
		sc.close();
		

	}
	

}
