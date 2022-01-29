package oops.inheritance;

public class Person {

	public String name;
	public int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
