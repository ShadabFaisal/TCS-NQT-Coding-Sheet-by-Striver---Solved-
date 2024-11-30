package Arrays;

import java.util.Arrays;

public class RotateLeftArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int r=2;
		int prev, temp;
		 for(int i=0;i<r;i++) {
			 prev=arr[0];
			 for(int j=arr.length-1;j>=0;j--) {
				 temp=arr[j];
				 arr[j]=prev;
				 prev=temp;
			 }
		 }
		 System.out.println(Arrays.toString(arr));
	}

}
