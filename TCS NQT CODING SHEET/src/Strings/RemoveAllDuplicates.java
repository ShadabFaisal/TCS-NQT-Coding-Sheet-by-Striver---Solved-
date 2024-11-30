package Strings;

public class RemoveAllDuplicates {

	public static void main(String[] args) {
		String str = "cbacdcbc";
		StringBuilder sb= new StringBuilder(str);
		String ans="";
		for(int i=0;i<sb.length();i++) {
			int j=0;
			for(j=0;j<i;j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					break;
				}
			}
			if(i==j) {
				ans+=sb.charAt(i);
			}
		}
		System.out.println(ans);
		
	}
	
	
	

}
