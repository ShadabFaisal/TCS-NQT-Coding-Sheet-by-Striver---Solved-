package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(reverse(s));
		sc.close();
	}
	public static String reverse(String s) {
		if(s==null || s.length()<=1) {
			return s;
		}
		
		return reverse(s.substring(1))+s.charAt(0);
	}

}
