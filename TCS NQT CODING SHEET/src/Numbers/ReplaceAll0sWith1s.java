package Numbers;

import java.util.Scanner;

public class ReplaceAll0sWith1s {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=102003;
		String num=Integer.toString(n);
		String s1="";
		for (int i = 0; i < num.length(); i++) {
			if(num.charAt(i)=='0') {
				s1+='1';
			}
			else {
			s1+=num.charAt(i);
			}
		}
		int ans=Integer.parseInt(s1);
		System.out.println(ans);
		System.out.println(replaceZerosWithOnes(n));
		sc.close();
	}
	 static int replaceZerosWithOnes(int num) {
	      if (num == 0) {
	         return 1;
	      }
	      int ans = 0, tmp = 1;
	      while (num > 0) {
	         int d = num % 10;
	         if (d == 0) {
	            d = 1;
	         }
	         ans = d * tmp + ans;
	         num = num / 10;
	         tmp = tmp * 10;
	      }
	      return ans;
	   }


}
