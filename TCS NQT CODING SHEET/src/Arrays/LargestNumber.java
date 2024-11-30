package Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int arr[] =  {2,5,1,3,0};
		System.out.print(largestNumber(arr));
	}
	
	public static int largestNumber(int[] arr) {
		
		int largestNum=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestNum) {
				largestNum=arr[i];
			}
		}
		
		return largestNum;
	}

}
