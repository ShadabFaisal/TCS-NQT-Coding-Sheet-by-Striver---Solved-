package Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1,6,12};
		mergeSort(arr,0, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void mergeSort(int[] arr, int start, int end) {
		if(end-start==1)return;
		
		int mid=start+(end-start)/2;
		
		mergeSort(arr,start,mid);
		mergeSort(arr,mid,end);
		
		merge(arr,start,mid,end);
	}
	
	public static void merge(int[] arr, int s, int m, int e) {
		int[] mergedArray=new int[e-s];
		int i=s;
		int j=m;
		int k=0;
		
		while(i<m && j<e) {
			if(arr[i]<arr[j]) {
				mergedArray[k]=arr[i++];
			}
			else {
				mergedArray[k]=arr[j++];
			}
			k++;
		}
		while(i<m) {
			mergedArray[k++]=arr[i++];
		}
		while(j<e) {
			mergedArray[k++]=arr[j++];
		}
		for(int l=0;l<mergedArray.length;l++) {
			arr[l+s]=mergedArray[l];
		}
		
		
	}

}
