package Numbers;

import java.util.Scanner;

public class SumOfAP {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		float a= sc.nextFloat();// first term
		int d=sc.nextInt();//Common Difference
		int n=sc.nextInt();//Number of terms in AP
		
		//System.out.println(findSumofAP(a,d,n));
		System.out.println(findSumusingFormula(a,d,n));
		sc.close();
	}
	public static int findSumofAP(float a, int d, int n) {
		float sum=0.0f;
		for (int i = 1; i <=n; i++) {
			sum+=a;
			a+=d;
		}
		return (int)sum;
	}
	public static int findSumusingFormula(float a, int d, int n) {
		float sum=(float) ((n/2.0)*(2.0*a+(n-1)*d));
		
		return (int)sum;
	}
	

}
