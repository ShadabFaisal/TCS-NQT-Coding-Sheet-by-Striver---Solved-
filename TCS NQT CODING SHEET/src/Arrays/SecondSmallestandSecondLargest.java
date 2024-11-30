package Arrays;

public class SecondSmallestandSecondLargest {

	public static void main(String[] args) {
		int arr[]={1,2,4,6,7,5};
		secondLargest(arr);
		secondSmallest(arr);
		secondSmallAndLarge(arr);
	}
	
	public static void secondLargest(int[] nums) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>largest){
				secondLargest=largest;
				largest=nums[i];
			}
			if(nums[i]>secondLargest && nums[i]!=largest) {
				secondLargest=nums[i];
			}
		}
//		System.out.println(largest);
		
		System.out.println(secondLargest);
		
	}
	
	public static void secondSmallest(int[] nums) {
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<smallest){
				secondsmallest=smallest;
				smallest=nums[i];
			}
			if(nums[i]<secondsmallest && nums[i]!=smallest) {
				secondsmallest=nums[i];
			}
		}
//		System.out.println(smallest);
		
		System.out.println(secondsmallest);
		
	}
	
	//Approach 2 using Math.min and Math.max function.
	
	public static void secondSmallAndLarge(int[] nums) {
	int secondsmall=Integer.MAX_VALUE;
	int small=Integer.MAX_VALUE;
	int large=Integer.MIN_VALUE;
	int secondlarge=Integer.MIN_VALUE;
	
		for(int i=0;i<nums.length;i++) {
			small=Math.min(small, nums[i]);
			large=Math.max(large, nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>secondlarge && nums[i]!=large) {
				secondlarge=nums[i];
			}
			if(nums[i]<secondsmall && nums[i]!=small) {
				secondsmall=nums[i];
			}
			
		}
		System.out.println(secondsmall);
		System.out.println(secondlarge);
	}


}
