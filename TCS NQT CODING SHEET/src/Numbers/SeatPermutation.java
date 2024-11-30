package Numbers;

public class SeatPermutation {

	public static void main(String[] args) {
		 int n = 6, r = 4;
		 System.out.println(fact(n)/fact(n-r));
		 int ans = 1;
		    for (int i = n; i >= n - r + 1; i--) {
		      ans *= i;
		    }
		    System.out.print(ans);
	}
	static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

}
