package Strings;

import java.util.Scanner;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				str=str.substring(0,i)+str.substring(i+1);
			}
		}
		System.out.println(str);
		sc.close();
	}

}
