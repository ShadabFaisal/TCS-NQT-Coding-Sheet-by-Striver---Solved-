package Arrays;

public class findMedian {

	public static void main(String[] args) {
		//int arr[] = { 5, 4, 3, 2, 1,6};
		int[] arr = {4, 7, 1, 2, 5, 6};
		int[] sorted=sort(arr);
		System.out.println(findMedianArray(sorted,6));
		
	}
	public static int[] sort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
	}
	
	public static double findMedianArray(int[] arr , int n)
	{
		if(n%2==0) {
			int index1=(n/2)-1;
			int index2=n/2;
			return (double)(arr[index1]+arr[index2])/2;
		}
		else {
			return arr[n/2];
		}
	}
}
