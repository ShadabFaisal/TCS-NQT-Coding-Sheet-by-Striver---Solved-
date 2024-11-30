package Strings;

public class SumOfAllNumbersInString {

	public static void main(String[] args) {
		String s="1adcde34cd22";
		String tempSum="0";
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				tempSum+=ch;
			}
			else {
				sum+=Integer.parseInt(tempSum);
				tempSum="0";
			}
		}
		System.out.println(sum+Integer.parseInt(tempSum));
	}

}
