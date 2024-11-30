package Strings;

import java.util.Scanner;

public class VowelsConsonantsWhitespace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int v=0,c=0,w=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				v++;
			}
			else if(ch>'a' && ch<='z') {
				c++;
			}
			else if(Character.isWhitespace(ch)) {
				w++;
			}
		}
		System.out.println("Total no. of vowels: "+v);
		System.out.println("Total no. of consonants: "+c);
		System.out.println("Total no. of whitespaces: "+w);

		sc.close();
	}
	

}
