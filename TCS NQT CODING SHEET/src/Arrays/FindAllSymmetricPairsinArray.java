package Arrays;

import java.util.HashMap;

public class FindAllSymmetricPairsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 5;
		int[][] arr = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };

		// brute-force approach
		/*
		 * for(int i=0;i<n;i++) { for(int j=i+1;j<n;j++) { if(arr[j][1]==arr[i][0] &&
		 * arr[j][0]==arr[i][1]) { 
		 * System.out.print("("+arr[i][1]+", "+arr[i][0]+") ");
		 * } 
		 * } 
		 * }
		 */
		
		//Using HashMap
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		System.out.println("The Symmetric Pairs are: ");
		for (int i = 0; i < arr.length; i++) {
			int first = arr[i][0];
			int second = arr[i][1];
			if (mp.get(second) != null && mp.get(second) == first) {
				System.out.print("(" + first + "," + second + ") ");
			} else {
				mp.put(first, second);
			}
		}

	}

}
