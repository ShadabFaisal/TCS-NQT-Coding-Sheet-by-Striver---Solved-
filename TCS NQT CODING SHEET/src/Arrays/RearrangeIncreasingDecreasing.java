package Arrays;

public class RearrangeIncreasingDecreasing {

	public static void main(String[] args) {
		
		int[] a= {4,2,8,6,15,5,9,20};
		rearrange(a,a.length);
		
	}
	public static void rearrange(int[] arr, int n) {
		int mid=n/2;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=mid;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}
	
	public static void swap(int[] arr, int start, int end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

}
