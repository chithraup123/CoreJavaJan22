package oops.overloading;

public class MethodOveloadingExample {

	public void sum(int a, int b) {
		int sum = a+b;
		
		System.out.println(sum);
	}
	public void sum(float a, float b) {
		float res = a+b;
		System.out.println(res);
	}
	public void sum(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
}
