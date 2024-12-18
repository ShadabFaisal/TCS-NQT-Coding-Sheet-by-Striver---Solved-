package Arrays;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-1,-2,-9,-6};
		
		int ans=nums[0];
		int max=ans;
		int min=ans;
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]<0) {
				int temp=max;
				max=min;
				min=temp;
			}
			max=Math.max(nums[i], max*nums[i]);
			min=Math.min(nums[i], min*nums[i]);
			ans=Math.max(max,ans);
		}
		System.out.println(ans);

	}

}
