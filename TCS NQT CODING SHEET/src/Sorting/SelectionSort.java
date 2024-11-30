package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,63,21,34,23,6};
		selectionSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	} 
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int end=arr.length-i-1;
			int maxIndex=getMaxIndex(arr,0,end);
			swap(arr,maxIndex,end);
		}
	}
	
	public static int getMaxIndex(int[] arr,int start,int end) {
		int maxIndex=start;
		
		
		for(int i=start;i<=end;i++) {
			if(arr[i]>arr[maxIndex]) {
				maxIndex=i;
			}
		}
		return maxIndex;	
	}
	public static void swap(int[] arr, int start, int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	

}
