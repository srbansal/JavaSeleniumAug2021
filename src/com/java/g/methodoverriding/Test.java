package com.java.g.methodoverriding;

class Shape
{
	void draw()
	{
		System.out.println("Drawing no shape");
	}
}

class Circle extends Shape
{
	void draw()		// method overriding: signature must match with the parent class method
	{
		System.out.println("Drawing Circle");
	}
}

class Rectangle extends Shape
{
	void draw()		// method overriding
	{
		System.out.println("Drawing Rectangle");
	}
}

class Triangle extends Shape
{
	void draw()		// method overriding
	{
		System.out.println("Drawing Triangle");
	}
}


public class Test {

	public static void main(String[] args) {
//		ClassName refVar = new ClassName();
//		or
//		ClassName refVar;
//		refVar = new ClassName();
		
//		Circle c = new Circle();
//		Rectangle r = new Rectangle();
//		Triangle t = new Triangle();
		
	
		Shape s; // null
		
		s = new Shape();
		s.draw();  // Drawing no shape
		
		Circle c = new Circle();
		c.draw(); // Drawing Circle
//		-----------------------------------------------
//		late binding, object is useful to decide the method body to be used. 
		s = new Circle();  // upcasting > storing obj of subclass in ref of Super 
//		This kind of upcasting is possible only in case of inherited class
		s.draw(); // Drawing Circle
		
		s = new Rectangle();
		s.draw(); // Drawing Rectangle
		
		s = new Triangle();
		s.draw(); // Drawing Triangle
		
		
	}

}
