package Strings;

public class StartingIndexOfSubstring {

	public static void main(String[] args) {
		String s="hello";
		String sb="taz";
		if(s.contains(sb)) {
			System.out.println(s.indexOf(sb));
		}
		else {
			System.out.println(-1);
		}
	}

}
