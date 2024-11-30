package NumberSystem;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String binary=sc.next();
		int decimal=0;
		int base=1;
		for(int i=binary.length()-1;i>=0;i--) {
			if(binary.charAt(i)=='1') {
				decimal+=base;
			}
			base*=2;
		}
		System.out.println(decimal);
		sc.close();
	}

}
