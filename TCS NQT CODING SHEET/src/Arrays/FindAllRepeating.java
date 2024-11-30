package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindAllRepeating {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
		findRepeating(arr);// Brute-Force
		System.out.println();
		findRepeatingUsingSorting(arr);// Optimal
		System.out.println();
		findRepeatingUsingMap(arr);
		System.out.println();
		findRepeatingUsingSet(arr);

	}

	// Brute-Force using an array

	public static void findRepeating(int[] arr) {

		int k = 0;
		int[] duplicates = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicates[k++] = arr[i];
				}
			}
		}
		for (int i = 0; i < k; i++) {
			if (duplicates[i] != duplicates[i + 1]) {
				System.out.print(duplicates[i] + " ");
			}
		}

	}

	// Using Sorting

	public static void findRepeatingUsingSorting(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	// Using Set
	public static void findRepeatingUsingSet(int[] arr) {

		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			if (set.contains(i)) {
				System.out.print(i + " ");
			}
			set.add(i);
		}
	}

	// Using Map
	public static void findRepeatingUsingMap(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (int key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.print(key + " ");
			}
		}

	}

}
