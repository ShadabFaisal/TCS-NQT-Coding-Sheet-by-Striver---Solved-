package Strings;

import java.util.Arrays;

public class SortCharacters {

	public static void main(String[] args) {
		String str = "zxcbg";

	    System.out.println("String after sorting:");
	    System.out.println(solve(str));
	}
	static String solve(String str) {
		
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		
		return new String(ch);
	}

}
