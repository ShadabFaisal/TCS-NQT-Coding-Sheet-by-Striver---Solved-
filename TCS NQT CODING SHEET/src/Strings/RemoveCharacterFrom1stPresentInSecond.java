package Strings;

import java.util.HashMap;

public class RemoveCharacterFrom1stPresentInSecond {

	public static void main(String[] args) {
		String str1 ="abcdef";
		String str2 ="cefz";
		
		StringBuilder sb=new StringBuilder("");
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(char ch: str2.toCharArray()) {
			map.put(ch, 1);
		}
		for (char ch2: str1.toCharArray()) {
			if(map.get(ch2)==null) {
				sb.append(ch2);
			}
		}
		
		System.out.println(sb.toString());
		

	}

}
