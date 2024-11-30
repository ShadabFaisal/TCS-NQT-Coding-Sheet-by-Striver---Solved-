package Arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromSorted {
	
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,2,3,3,4};
		//removeDuplicatesUsingHashSet(arr);
		int k=removeDuplicatesUsingtwoPointers(arr);
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void removeDuplicatesUsingHashSet(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		
		for(int n:set) {
			System.out.print(n+" ");
		}
	}
	
	public static int removeDuplicatesUsingtwoPointers(int[] arr) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		
		return i+1;
	}
}
