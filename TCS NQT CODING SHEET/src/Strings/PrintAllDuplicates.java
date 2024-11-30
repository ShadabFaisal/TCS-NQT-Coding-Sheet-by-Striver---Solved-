package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PrintAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sinstriiintng";

		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : map.keySet()) {
			int value = map.get(ch);
			if (value >= 2) {
				System.out.println(ch + "-" + value);
			}
		}
		
	}

}
