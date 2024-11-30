package Arrays;

public class ReverseArrayAfterKthPos {

	public static void main(String[] args) {
		int[] arr= {10,9,8,7,6};
		int m=2;
		reverseArray(arr,m);
		}
	 public static void reverseArray(int[] arr, int m)
	    {
	        // Write your code here.
	        int s=m+1;
	        int e=arr.length-1;
	        while(s<e){
	            int temp=arr[s];
	            arr[s]=arr[e];
	            arr[e]=temp;
	            s++;
	            e--;
	        }
	        
	        for(int i: arr){
	            System.out.print(i+" ");
	        }
	    }

}
