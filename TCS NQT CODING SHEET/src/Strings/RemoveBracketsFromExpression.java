package Strings;

public class RemoveBracketsFromExpression {

	public static void main(String[] args) {

		String exp="a+((b-c)+d)";
		StringBuilder sb=new StringBuilder("");
		
		for (int i = 0; i < exp.length(); i++) {
			if(exp.charAt(i)!='(' && exp.charAt(i)!=')') {
				sb.append(exp.charAt(i));
			}
		}
		System.out.println(sb.toString());
		
	}

}
