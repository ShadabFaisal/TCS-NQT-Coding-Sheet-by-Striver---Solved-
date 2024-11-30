package NumberSystem;

public class DecimalToOctal {

	public static void main(String[] args) {
		
		int num=17;
		StringBuilder sb=new StringBuilder("");
		while(num!=0) {
			int rem=num%8;
			sb.append(rem);
			num/=8;
			
		}
		System.out.println(sb.reverse());
	}

}
