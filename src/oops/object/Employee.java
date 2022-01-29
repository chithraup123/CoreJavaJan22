package oops.object;

public class Employee {
	
	public String name;
	public int employeeId;
	
	// std way is to use static method to assign the static variables
	private static int salary = 5000;
	
	public Employee(String name, int employeeId, int salary) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public Employee(String name, int empId) {
		
		this.name = name;
		this.employeeId = empId;
	}
	
	public static void setSalary(int amt) {
		salary = amt;
	}

	public void printEmpDetails() {
		System.out.println(this.name+" "+this.employeeId + " "+this.salary);
	}
}
