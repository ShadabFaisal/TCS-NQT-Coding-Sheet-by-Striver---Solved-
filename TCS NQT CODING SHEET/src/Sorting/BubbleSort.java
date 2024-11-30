package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {5,63,21,34,23,6};
		bubbleSort(arr,arr.length);

	}
	public static void bubbleSort(int[] arr,int n) {
		int temp=0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}