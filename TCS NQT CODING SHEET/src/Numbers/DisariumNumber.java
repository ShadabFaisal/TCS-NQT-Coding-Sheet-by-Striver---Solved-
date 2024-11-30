package Numbers;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int k=isDisarium(N);
		System.out.println(k);
		sc.close();

	}
	static int isDisarium(int N) {
        // code here
        int c=0;
        int sum =0;
        int m=N;
        int num=N;
        while(N>0){
            int r=N%10;
            c++;
            N/=10;
        }
        while(num>0){
            int r1=num%10;
            sum+=(int)Math.pow(r1,c);
            c--;
            num/=10;
        }
        return sum==m?1:0;
    }

}
