package Arrays;

import java.util.HashMap;

public class FindAllNonRepeatingInArray {

	public static void main(String[] args) {
			int[] nums= {1,2,-1,1,3,1};
			findAllNonRepeatingUsingMap(nums);

	}
	public static void findAllNonRepeatingUsingMap(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (int key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + " ");
			}
		}

	}

}
