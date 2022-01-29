package oops.inheritance;

public class RunnerClass {

	public static void main(String[] args) {

		ChildClass child1 = new ChildClass("Mahesh", 25, "Actor");
		child1.display();

		ChildClass child2 = (ChildClass) new Person("Alex", 20);
		child2.display();

	}

}
