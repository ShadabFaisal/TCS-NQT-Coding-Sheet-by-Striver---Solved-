package Arrays;

import java.util.*;
import java.util.Scanner;

public class RotateArrayByKelements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] leftarr = { 1, 2, 3, 4, 5 };
		int[] rightarr = { 1, 2, 3, 4, 5 };
		leftrotateArrayUsingTwoVariable(leftarr, k);
		System.out.println(Arrays.toString(leftarr));
		rightrotateArrayUsingTwoVariable(rightarr, k);
		System.out.println(Arrays.toString(rightarr));
		sc.close();
	}

	public static void leftrotateArrayUsingTwoVariable(int[] arr, int k) {

		int prev, temp;

		for (int i = 0; i < k; i++) {
			prev = arr[0];
			for (int j = arr.length - 1; j >= 0; j--) {
				temp = arr[j];
				arr[j] = prev;
				prev = temp;
			}
		}
	}

	public static void rightrotateArrayUsingTwoVariable(int[] arr, int k) {

		int prev, temp;

		for (int i = 0; i < k; i++) {
			prev = arr[arr.length - 1];
			for (int j = 0; j < arr.length; j++) {
				temp = arr[j];
				arr[j] = prev;
				prev = temp;
			}
		}
	}

}
