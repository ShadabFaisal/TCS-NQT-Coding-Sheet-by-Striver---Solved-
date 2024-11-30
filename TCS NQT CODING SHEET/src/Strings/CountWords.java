package Strings;

public class CountWords {

	public static void main(String[] args) {
		String s="My name is Shadab Faisal";
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i+1)==' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
