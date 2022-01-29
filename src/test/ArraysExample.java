package test;

public class ArraysExample {

	public static void main(String[] args) {
		int[] intArray = {1,3,2,5,4};
		
		System.out.println("Length of array is "+ intArray.length);
		System.out.println("Value at last position is "+ intArray[intArray.length-1]);
		
		String[] strArray = {"abc", "xyz", "pqr"};
		System.out.println("Value at 2nd position is "+ strArray[1]);
		
		String str1="Clean India Green India";
		
		strArray = str1.split(" ");
		System.out.println("The tring on 2nd poition is "+strArray[1]);
		
	}

}
