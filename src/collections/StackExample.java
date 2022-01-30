package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.add(10);
		stack1.add(8);
		stack1.add(20);
		System.out.println("Items in the stack are ");
		
		System.out.println(stack1);
		
		System.out.println("Peek element is ");
		System.out.println(stack1.peek());
		
		//remove last element
		stack1.pop();		
		System.out.println(stack1);
		
		//adding the item in the last position
		stack1.add(5);
		System.out.println(stack1);
		

	}

}
