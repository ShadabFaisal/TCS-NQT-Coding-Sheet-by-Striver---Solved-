package Sorting;
import java.util.*;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,1,5,4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void cyclicSort(int array[]) {
        // Your Code Here
        int i=0;
        while(i<array.length){
            int correct=array[i]-1;
            if(array[i]!=array[correct]){
                swap(array,i, correct);
            }
            else{
                i++;
            }
        }     
      
    }
    public static void swap(int arr[], int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
