package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 23, 63, 21, 34, 28, 6 ,99};
		insertionSort(arr);
		
	}

	public static void insertionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j>0 && j<arr.length;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
				else {
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
