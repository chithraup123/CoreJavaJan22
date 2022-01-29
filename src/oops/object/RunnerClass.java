package oops.object;

public class RunnerClass {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Rohit", 1296, 1200);
		Employee emp2 = new Employee("Priya", 1257, 1000);
		Employee emp3 = new Employee("Sachin", 1209);
		Employee.setSalary(2500);
		emp1.printEmpDetails();
	}
}
