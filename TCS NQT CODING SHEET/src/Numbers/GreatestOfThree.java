package Numbers;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && b>c) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		sc.close();

	}

}
