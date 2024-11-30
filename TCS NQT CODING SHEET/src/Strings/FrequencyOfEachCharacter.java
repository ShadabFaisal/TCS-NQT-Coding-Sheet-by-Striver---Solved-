package Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		String s="takeuforward";
		
		Map<Character, Integer> map= new HashMap<>();
		
		for(char ch: s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);

	}

}
