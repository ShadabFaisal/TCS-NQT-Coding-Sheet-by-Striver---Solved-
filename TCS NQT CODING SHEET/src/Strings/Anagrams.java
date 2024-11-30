package Strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1="RULES";
		String s2="LESRT";
		System.out.println(checkAnagram(s1,s2));
	}
	
	static boolean checkAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean isAnagram=Arrays.equals(ch1, ch2);
		
		
		return isAnagram;
	}

}
