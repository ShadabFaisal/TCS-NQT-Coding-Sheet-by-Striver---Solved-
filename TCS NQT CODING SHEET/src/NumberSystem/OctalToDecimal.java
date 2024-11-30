package NumberSystem;

public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=345;
		System.out.println(OctaltoDecimal(num));

	}
	public static int OctaltoDecimal(int Octal) {
	    int Decimal = 0;
	    int i = 0;
	    while (Octal != 0) {
	      int rem = Octal % 10;
	      Decimal += rem * Math.pow(8, i);
	      i++;
	      Octal /= 10;
	    }
	    return Decimal;
	  }

}
