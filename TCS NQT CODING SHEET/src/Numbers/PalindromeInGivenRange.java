package Numbers;

public class PalindromeInGivenRange {

	public static void main(String[] args) {
		
		int start=100,end=150;
		
		for(int i=start;i<=end;i++) {
			if(isPalindrome(i)) {
				System.out.println(i+" ");
			}
		}
			
	}
	public static boolean isPalindrome(int n) {
		int rev=0;
		int m=n;
		do {
			int r=n%10;
			n/=10;
			rev=(rev*10)+r;
		}
		while(n>0);
		
		if(rev==m)return true;
		else
			return false;
	}

}
