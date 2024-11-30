package Numbers;

public class SumInGivenRange {

	public static void main(String[] args) {
		int st = 2;
		int e = 7;
		int sum = 0;
		while (st <= e) {
			sum += st;
			st++;
		}
		System.out.println(sum);

	}

}
