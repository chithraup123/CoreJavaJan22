package test;

public class ExceptionExample {

	public static void main(String[] args) {

		int num = 10;
		int div = 12;
		int[] numArray = { 10, 20, 30, 40, 50 };
		try {
			div = num / 2;

		} catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tried to access element from an array out of bound");
		} finally {
			System.out.println("Always this gets executed");
		}
	}
}
