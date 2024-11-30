package Arrays;

public class EquilibriumIndexOfArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, -1, 8, 4,3 };
		//int eqidx = findEquilibriumIndex(arr, arr.length);
		int eqidx2 = findEquilibriumIndex2(arr, arr.length);
		System.out.println(eqidx2);
	}

	// Brute-Force
	public static int findEquilibriumIndex(int[] arr, int n) {
		int leftsum, rightsum;

		for (int i = 0; i < n; i++) {
			leftsum = 0;
			for (int j = 0; j < i; j++) {
				leftsum += arr[j];
			}
			rightsum = 0;
			for (int j = i + 1; j < n; j++) {
				rightsum += arr[j];
			}

			if (leftsum == rightsum) {
				return i;
			}

		}
		return -1;
	}
	
	//Optimised using totalsum
	public static int findEquilibriumIndex2(int[] arr, int n) {
		int totalsum=0;
		for (int i = 0; i < n; i++) {
			totalsum+=arr[i];
		}
		
		int leftsum=0, rightsum=totalsum;
		for (int i = 0; i < n; i++) {
			rightsum-=arr[i];
			if(rightsum==leftsum) {
				return i;
			}
			leftsum+=arr[i];
		}
		return -1;
	}
	

}
