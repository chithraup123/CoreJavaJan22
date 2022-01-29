package test;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int remainder;
		boolean flag = true;

		for (int index = 2; index < num/2; index++) {
			remainder = num % index;
			if (remainder == 0) {
				flag = false;
				break;
			}
		}

		if (flag == false) {
			System.out.println("The num is not prime");
		} else {
			System.out.println("The num is prime");
		}
	}

}
