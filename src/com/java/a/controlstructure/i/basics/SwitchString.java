package com.java.a.controlstructure.i.basics;

public class SwitchString {

	public static void main(String[] args) {
		String choice = "Div";
		
		switch(choice)
		{
		case "Add":
			System.out.println("Addition performed");
			break;
		case "Subtract":
			System.out.println("Subtraction performed");
			break;
		case "Multiply":
			System.out.println("Multiplication performed");
			break;
		default:
			System.out.println("Please enter a valid choice");
		}
		
	}

}
