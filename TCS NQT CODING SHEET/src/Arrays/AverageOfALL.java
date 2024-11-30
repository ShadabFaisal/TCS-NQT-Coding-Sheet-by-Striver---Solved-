package Arrays;

public class AverageOfALL {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double average=sum/5.0;
		System.out.println("Average= "+average);

	}

}
