package Strings;

public class SuperReducedString {

	public static void main(String[] args) {
		//String s="aaabccddd";
		String str="aab";
		System.out.println(reducedStringUsingStringBuilder(str));
	}
public static String reducedStringUsingStringBuilder(String str) {
	
		
		StringBuilder sb=new StringBuilder(str);
		
		for(int i=1;i<sb.length();i++) {
			if(sb.charAt(i)==sb.charAt(i-1)) {
				sb.delete(i-1, i+1);
				i=0;
			}
		}
		
		String reduced=sb.toString();
		if(reduced.length()==0) {
			return "Empty String";
		}
		
		return reduced;
	}
}
