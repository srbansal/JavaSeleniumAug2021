package com.java.f.inheritance;
// Single Inheritance

import java.util.Scanner;

class Account 
{
	String id;
	double balance;
	
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter id and balance");
		id = sc.next();
		balance = sc.nextDouble();
	}
	
	void show()
	{
		System.out.println("ID: " + id);
		System.out.println("Balance: " + balance);		
	}

}


public class SavingAccount extends Account
{
	float rateOfInterest;
	
	void inputSavingDetails() {
		System.out.println("Enter ROI");
		rateOfInterest = sc.nextFloat();
	}
	
	void showSavingDetails() {
		System.out.println("ROI: " + rateOfInterest);
	}
	
	public static void main(String[] args) {
		SavingAccount obj = new SavingAccount();
		
		obj.input();
		obj.inputSavingDetails();
		obj.show();
		obj.showSavingDetails();
	}
}

