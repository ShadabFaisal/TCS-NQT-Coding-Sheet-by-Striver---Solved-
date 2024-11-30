package Arrays;

import java.util.Arrays;

public class RotateRightArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int r=2;
		int prev, temp;
		 for(int i=0;i<r;i++) {
			 prev=arr[arr.length-1];
			 for(int j=0;j<arr.length;j++) {
				 temp=arr[j];
				 arr[j]=prev;
				 prev=temp;
			 }
		 }
		 System.out.println(Arrays.toString(arr));

	}

}
