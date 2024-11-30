package Strings;

public class CapitalizeFirstAndLast {

	public static void main(String[] args) {
		String str = "take u forward is awesome";
		String[] arr = str.split(" ");
		String ans = "";
		char first = '0', last = '0';
		String sb = "";
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (word.length() <= 1) {
				first = Character.toUpperCase(word.charAt(0));
				sb = "" + first;
				ans += sb + " ";
			} else {
				first = Character.toUpperCase(word.charAt(0));
				last = Character.toUpperCase(word.charAt(word.length() - 1));
				sb = word.substring(1, word.length() - 1);
				ans += first + sb + last + " ";
			}
		}
		System.out.println(ans);
	}

}
