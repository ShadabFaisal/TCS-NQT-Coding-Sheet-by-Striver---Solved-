package Numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPerfect(n));
		System.out.println(isPerfectNumber(n));
		sc.close();
	}
	
	public static boolean isPerfect(int n) {
		int sum=0;
		int m=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==m) {
			return true;
		}
		return false;
	}
	
	/*Solution 2: Efficient Solution

We can use this elegant mathematical property that if n is divisible by k, then n will be also divisible by (n/k).

For example, 28 is divisible by 4, also 28 is divisible by (28/4)=7

In this way, we can reduce our search space from (1 … n-1) to (1… √n ).*/
	
	
	public static boolean isPerfectNumber(int n) {
		
		int sum=0;
		
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(i*i==n || i==1) {
					sum+=i;
				}
				else {
					sum+=i+n/i;
				}
			}
		}
		if(sum==n)return true;
		else
			return false;
	}
	
	

}
