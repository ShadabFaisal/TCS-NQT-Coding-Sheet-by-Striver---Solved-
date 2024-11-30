package NumberSystem;

public class OctalToBinary {

	public static void main(String[] args) {
		
		int num=345;
		String bin="";
		String ans=OctaltoDecimaltoBinary(num);
		if(ans.length()%3==1) {
			bin="00"+ans;
		}
		else if(ans.length()%3==2) {
			bin="0"+ans;
		}
		else {
			bin=ans;
		}
	System.out.println(bin);
		
	}
	public static String OctaltoDecimaltoBinary(int Octal) {
	    int Decimal = 0;
	    int i = 0;
	    while (Octal != 0) {
	      int rem = Octal % 10;
	      Decimal += rem * Math.pow(8, i);
	      i++;
	      Octal /= 10;
	    }
	    return DecimalToBinary(Decimal);
	  }

	public static String DecimalToBinary(int num) {
		StringBuilder sb=new StringBuilder("");
		while(num!=0) {
			int rem=num%2;
			sb.append(rem);
			num/=2;
		}
		return sb.reverse().toString();
	}
}
