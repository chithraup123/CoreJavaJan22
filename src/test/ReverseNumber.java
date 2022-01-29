package test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int remainder;
		int rev = 0;

		while (num > 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		System.out.println(rev);

		//Another method to reverse the number using String
//		int n1 = 345278;
//		String str1 = String.valueOf(n1);
//
//		String[] str2 = str1.split("");
//		int len = str2.length;
//		for (int j = len - 1; j >= 0; j--) {
//			System.out.print(str2[j]);
//		}
	}

}
