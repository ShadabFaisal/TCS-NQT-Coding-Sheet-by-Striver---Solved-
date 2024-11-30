package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindNonRepeatingCharacters {

	public static void main(String[] args) {
		String s = "google";
		Map<Character, Integer> map= new HashMap<>();
		HashSet<Character> set=new HashSet<>();
		for(char ch: s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}	
		for(char ch: map.keySet()) {
			int value=map.get(ch);
			if(value==1) {
			set.add(ch);	
			}
		}
		System.out.println(set);
	}

}
