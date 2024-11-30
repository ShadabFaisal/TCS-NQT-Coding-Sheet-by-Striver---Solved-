package Arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int arr[] =  {2,5,1,3};
		System.out.print(smallestNumber(arr));
	}
	
	public static int smallestNumber(int[] arr) {
		
		int smallestNum=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallestNum) {
				smallestNum=arr[i];
			}
		}
		
		return smallestNum;
	}

}
