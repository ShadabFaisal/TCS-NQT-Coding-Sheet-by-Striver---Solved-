package Arrays;

import java.util.Scanner;

public class AddingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,0};
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//insertAtBeginning(arr,num);
		//insertAtEnd(arr,num);
		insertAtAnyPosition(arr,num,4);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	public static void insertAtBeginning(int[] arr, int num) {
		
		for(int i=arr.length-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=num;
	}
	public static void insertAtEnd(int[] arr,int num) {
		arr[arr.length-1]=num;
	}
	
	public static void insertAtAnyPosition(int[] arr, int num, int index) {
		for(int i=arr.length-2;i>=index;i--) {
			arr[i+1]=arr[i];
		}
		arr[index]=num;
	}
	

}
