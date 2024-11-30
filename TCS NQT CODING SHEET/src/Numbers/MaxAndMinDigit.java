package Numbers;

import java.util.Scanner;

public class MaxAndMinDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int n=sc.nextInt();
		while(n>0) {
			int r=n%10;
			n/=10;
			if(r>max) {
				max=r;
			}
			if(r<min) {
				min=r;
			}
		}
		System.out.println(max);
		System.out.print(min);
		sc.close();
	}

}
