package com.java.g.methodoverriding;

public class Sample {

	Shape create(char ch)  // create an object and return the object > Factory methods
	{
		if(ch == 'C')
		{
//			Circle c = new Circle();
//			return c;
			return new Circle();
		}
		else if(ch == 'R')
		{
			return new Rectangle();  // anonymous object > not having name
		}
		else if(ch == 'T')
		{
			return new Triangle();
		}
		else
		{
			return new Shape();
		}
		
	}
	
	public static void main(String[] args) {
		Sample obj = new Sample();
		Shape s = obj.create('R');
		s.draw();  // Drawing ----- // depends on the character send to create method
	}

}
