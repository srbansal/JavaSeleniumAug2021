package com.java.f.inheritance;

class CurrentAccount extends Account
{
	double transactionFee;
	
	void inputCurrentDetails()
	{
		System.out.println("Enter transaction fee: ");
		transactionFee = sc.nextDouble();
	}
	
	void showCurrentDetails()
	{
		System.out.println("Transaction Fee: " + transactionFee);
	}
}

public class Test {

	public static void main(String[] args) {
		SavingAccount s = new SavingAccount(); // id, balance, roi
		CurrentAccount c = new CurrentAccount(); // id, balance, transactionFee
		
		System.out.println("Enter Saving Account Details");
		s.input();
		s.inputSavingDetails();
		
		System.out.println("Enter Current Account Details");
		c.input();
		c.inputCurrentDetails();
		
		System.out.println("Details of Savings Account: ");
		s.show();
		s.showSavingDetails();
		
		System.out.println("Details of Current Account: ");
		c.show();
		c.showCurrentDetails();
	}

}
