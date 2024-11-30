package Strings;

import java.util.Scanner;

public class RemoveCharactersExceptAlphabets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			int ascii=(int)s.charAt(i);
			if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122) {
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
		sc.close();
	}

}
