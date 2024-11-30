package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceEachByRank {

	public static void main(String[] args) {
		int[] arr= {20,15,26,2,98,6};
		//sorted order =2,6,15,20,26,98
		//Output= 4,3,5,1,6,2
	
		//Brute-Force
		/*
		for (int i = 0; i < arr.length; i++) {
			Set<Integer> set=new HashSet<>();
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]<arr[i]) {
					set.add(arr[j]);
				}
			}
			int rank=set.size()+1;
			System.out.print(rank+" ");
		}
		*/
		
		//Optimised-Approach

		int[] dummy=new int[arr.length];
		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			dummy[i]=arr[i];
		}
		Arrays.sort(dummy);
		int temp=1;
		for (int i = 0; i < dummy.length; i++) {
			if(map.get(dummy[i])==null) {
				map.put(dummy[i], temp);
				temp++;
			}
		}
		
		for (int i : arr) {
			System.out.print(map.get(i)+" ");
		}
		
	}

}
