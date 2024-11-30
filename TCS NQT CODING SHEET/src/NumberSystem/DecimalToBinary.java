package NumberSystem;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		StringBuilder sb=new StringBuilder("");
		while(num!=0) {
			int rem=num%2;
			sb.append(rem);
			num/=2;
			
		}

		System.out.println(sb.reverse());
	}

}
