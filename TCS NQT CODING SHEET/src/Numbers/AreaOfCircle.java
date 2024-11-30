package Numbers;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		double pi=3.14;
		double area=pi*Math.pow(radius, 2);
		System.out.println("Area of Circle: "+area);
		sc.close();
	}

}
