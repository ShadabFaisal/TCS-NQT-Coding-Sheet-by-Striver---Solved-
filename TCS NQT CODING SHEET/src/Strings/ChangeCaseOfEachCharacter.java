package Strings;

public class ChangeCaseOfEachCharacter {

	public static void main(String[] args) {

		String s="jaVa";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch)) {
				ch=Character.toUpperCase(ch);
			}
			else if(Character.isUpperCase(ch)) {
				ch=Character.toLowerCase(ch);
			}
			s1=s1+ch;
		}
		System.out.println(s1);
	}

}
