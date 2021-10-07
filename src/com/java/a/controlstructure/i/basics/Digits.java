package com.java.a.controlstructure.i.basics;

public class Digits {

	public static void main(String[] args) {
		int carCost = 4_50_000;
		
		System.out.println("Car cost: " + carCost);
		
		String num = "450000";
//		String num2 = "450000A"; // error during parseInt
		System.out.println("Car cost: " + num);
		
		String contact = "45-555-321";  // error during parseInt
		System.out.println("contact: " + contact);
		
		int n = Integer.parseInt(num);
//		int n = Integer.parseInt(contact);
//		int n = Integer.parseInt(carCost);
		System.out.println("Car cost: " + n);
		
	}

}
