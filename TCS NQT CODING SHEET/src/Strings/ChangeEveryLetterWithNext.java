package Strings;

public class ChangeEveryLetterWithNext {

	public static void main(String[] args) {
		String str="abcdxyz";
		String ans="";
		for(char ch: str.toCharArray()) {
			int ascii=(int) ch;
			if(ch=='z' || ch=='Z') {
				ans+=(char)(ascii-25);
			}
			else {
			ans+=(char)(++ascii);
			}
		}
		System.out.println(ans);
		
	}

}
