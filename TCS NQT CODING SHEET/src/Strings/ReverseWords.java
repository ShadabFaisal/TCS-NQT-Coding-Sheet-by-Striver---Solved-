package Strings;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "This is decent";
		
		String[] s1=s.split(" ");
		String ans="";
		for (int i = s1.length-1; i >=0; i--) {
			ans+=s1[i]+" ";
		}
		System.out.println(ans);

	}
	
	

}
