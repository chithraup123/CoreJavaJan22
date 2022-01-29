package oops.abstraction;

public abstract class BankExample {

	public abstract void checkBalance();

	public abstract void depositMoney();

	public abstract void withdrawMoney();

	public void welcome() {
		System.out.println("Welcome to the Bank");
	}
}
