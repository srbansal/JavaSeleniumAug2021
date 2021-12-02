package com.java.basics;

public class reversetri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}

	}

}
