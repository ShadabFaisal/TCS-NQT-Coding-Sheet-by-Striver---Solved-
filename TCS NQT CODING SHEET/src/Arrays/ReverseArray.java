package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1};
		printReverseArray(arr);
	}
	
	public static void printReverseArray(int[] nums) {
		
		for(int i=nums.length-1;i>=0;i--) {
			System.out.print(nums[i]+" ");
		}
	}

}
