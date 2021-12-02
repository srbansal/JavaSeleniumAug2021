package com.java.basics;

public class Arrayex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {11,13,7,4,10,5,12,10};
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}

	



//minimum

int num=array[0],max=array[0];
	for(int i=0;i<array.length;i++)
	{
		if(array[i]<num)
			num=array[i];
	}
		System.out.println(num);
		
//maximum
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		System.out.println(max);
	}
}