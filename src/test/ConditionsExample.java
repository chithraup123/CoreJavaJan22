package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the age");

		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("Eligible for voting");
		}

		else if (age == 17) {
			System.out.println("Wait for one more year");
		}

		else {
			System.out.println("U r not Eligible");
		}
		scanner.close();
	}

}
