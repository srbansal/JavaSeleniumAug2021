package com.java.a.controlstructure.i.basics;

public class First10NumbersDoWhile {

	public static void main(String[] args) {
		int number = 1;
//		do
//		{
//			System.out.println(number);
//			number++;
//		}while(number<=10);
		
		do
		{
			System.out.println(number);
			if(number == 10)
				break;
			number++;
		}while(true);
		
	}

}
