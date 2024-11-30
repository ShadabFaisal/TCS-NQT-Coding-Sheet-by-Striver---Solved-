package Arrays;

import java.util.HashMap;

public class RemoveDuplicatesFromUnsorted {

	public static void main(String[] args) {
		int[] arr= {1,1,2,4};
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for (int i : arr) {
			if(!map.containsKey(i)) {
				System.out.print(i+" ");
			}
			map.put(i,1);
		}
		

	}

}
