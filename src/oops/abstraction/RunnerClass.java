package oops.abstraction;

public class RunnerClass {

	public static void main(String[] args) {
		
		BankExample bank = new ICICIBank();
		bank.checkBalance();
	}

}
