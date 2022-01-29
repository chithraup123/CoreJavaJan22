package oops.inheritance;

public class ChildClass extends Person {

	public String profession;

	public ChildClass(String name, int age, String profession) {

		super(name, age);
		this.profession = profession;
	}

	public void display() {
		super.display();
		System.out.println();
	}
	
	public void childMethod() {
		
	}
}
