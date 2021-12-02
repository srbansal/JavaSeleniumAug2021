package com.java.basics;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {11,13,7,4,10,5,12,10};
		int search=10,count=0;
		//System.out.println(array);
		for(int i=0;i<array.length;i++)
		{
			if(search==array[i])
					count++;

		}
		System.out.println(count);
	}
}
