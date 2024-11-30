package Arrays;

public class BlockSwapAlgo {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int r=2;//rotation count
		int[] ans=rotateLeft(arr,r, arr.length);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	public static int[] rotateLeft(int[] arr, int r, int n) {
		r%=n;
		
		if(r==0 || r==n) {
			return arr;
		}
		int A=r;
		int B=n-r;
		
		while(A!=B) {
			if(A<B) {
				swap(arr,r-A,r-A+B,A);
				B=B-A;
			}
			else {
				swap(arr, r-A,r,B);
				A=A-B;
			}
		}
		swap(arr,r-A,r,A);
		
		return arr;
	}
	
	public static void swap(int[] arr, int aindex, int bindex, int k) {
		int temp;
		
		for (int i = 0; i < k; i++) {
			temp=arr[aindex+i];
			arr[aindex+i]=arr[bindex+i];
			arr[bindex+i]=temp;
		}
	}

}
