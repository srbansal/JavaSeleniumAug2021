package com.java.f.inheritance;
// Multilevel Inheritance
public class SilverSavingAccount extends SavingAccount {

	String offerId;
	
	void inputSilverDetails()
	{
		System.out.println("Enter offerId: ");
		offerId = sc.next();
	}
	
	void showSilverDetails()
	{
		System.out.println("OfferId: " + offerId);
	}
	
	public static void main(String[] args) {
		SilverSavingAccount obj = new SilverSavingAccount();
		
//		call methods of G.Parent, Parent and self
		obj.input();
		obj.inputSavingDetails();
		obj.inputSilverDetails();
		
		obj.show();
		obj.showSavingDetails();
		obj.showSilverDetails();
		
//		G.Parent, Parent, and self properties are accessible directly also
		System.out.println(obj.id);
		System.out.println(obj.rateOfInterest);
		System.out.println(obj.offerId);
	}

}
