package Strings;

public class WordWithHighestRepeatedLetters {

	public static void main(String[] args) {
			String s="abcdefg google microsoft";
			int maxword=0;
			int curmaxword=0;
			String result="";
			
			for(int left=0;left<s.length();) {
				int right=left+1;
				while(right<s.length() && s.charAt(right)!=' ') {
					right++;
				}
				
				int[] frequency=new int[26];
				curmaxword=0;
				
				for (int i = left; i <right; i++) {
					frequency[s.charAt(i)-'a']++;
				}
				for (int j = 0; j < 26; j++) {
					if(frequency[j]>1) {
						curmaxword++;
					}
				}
				if(curmaxword>maxword) {
					maxword=curmaxword;
					result="";
				for (int k =left ; k < right; k++) {
					result+=s.charAt(k);
				}
				}
				left=right+1;
			}
			
			if(result=="") {
				System.out.println(-1);
			}
			
			else {
				System.out.println(result);
			}
				
			
	}

}
