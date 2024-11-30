package Arrays;

public class Searchin1D {

	public static void main(String[] args) {
		
		int[] arr= {1,4,7,9,2,6};
		int target=9;
		int flag=0;
		int pos=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				flag=1;
				pos=i;
				break;
			}
			
		}
		
		if(flag==1) {
			System.out.println("Element found at index: "+pos);
		}
		else {
			System.out.println("Not found");
		}
		
		
	}

}
