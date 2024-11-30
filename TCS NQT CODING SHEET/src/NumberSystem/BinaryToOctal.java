package NumberSystem;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String binary=sc.next();
		int len=binary.length();
		
		if(len%3==1) {
			binary="00"+binary;
		}
		if(len%3==2) {
			binary="0"+binary;
		}
		
		String octal="";
		for(int i=0;i<len;i+=3) {
			int temp=(binary.charAt(i)-'0')*4+(binary.charAt(i+1)-'0')*2+(binary.charAt(i+2)-'0')*1;
			octal+=Integer.toString(temp);
		}
		System.out.println(octal);
		sc.close();
	}

}
