package Strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(isPalindrome(str)==true?"Palindrome":"Not a Palindrome String");
		sc.close();
	}
	public static boolean isPalindrome(String str) {
		String s1="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			s1+=ch;
		}
		if(s1.equalsIgnoreCase(str)) {
			return true;
		}
		return false;
	}

}
