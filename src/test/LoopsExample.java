package test;

public class LoopsExample {

	public static void main(String[] args) {

		//while loop
		int num = 1;
		while (num <= 10) {

			if (num == 5) {
				num = num + 1;
				continue;
			}
			System.out.println(num);
			num=num+1;
		}
		
		//for loop
		for(int count=0;count<=10;count++) {
			
			if(count==5) {
				break;
			}
			System.out.println("For loop "+count);
		}
		
		int[] numArray = {10, 20, 30, 40, 50, 60};
		
		for(int count=0; count<numArray.length; count++) {
			System.out.println("Number is "+ numArray[count]);
		}
		
		//Another type of for loop
		for(int value:numArray) {
			System.out.println("Number is "+value);
		}
		
	}

}
