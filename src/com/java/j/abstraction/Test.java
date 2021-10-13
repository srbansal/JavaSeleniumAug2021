package com.java.j.abstraction;

/*
abstract method > a method without implementation/ a method which has only signature
abstract class > containing abstract method. a class should use abstract keyword
abstract class > cannot be instantiated (cannot create the object). as they are incomplete classes.

A class may or may not have abstract methods
1. A normal class (complete class), with all concrete methods.
2. Even if there is one or more abstract methods, then the class is not a complete class; called as an abstract class.
  such class cannot be instantiated (cannot create the object). However it can be extended 
*/
/*
abstract method > a method without implementation/ a method which has only signature
abstract class > containing abstract method. a class should use abstract keyword
abstract class > cannot be instantiated (cannot create the object). as they are incomplete classes.

A class may or may not have abstract methods
1. A normal class (complete class), with all concrete methods.
2. Even if there is one or more abstract methods, then the class is not a complete class; called as an abstract class.
  such class cannot be instantiated (cannot create the object). Howerver it can be extended 
*/

/*
// What's the use of @Override annotation 
class A
{
	void fun1()
	{
		System.out.println("Parent class method which I wish to be overridden");
	}
}

class B extends A
{
	@Override
	void fun1()
	{
		
	}
	
	void fun2()
	{
		
	}
}*/


abstract class Shape 
{
	abstract void draw(); // abstract method
}

class Circle extends Shape
{
	@Override	// to add safety to our method: compiler will cross check the signature
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

class Rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

//Do not override the method draw() in Triangle class. How to handle this scenario? (by making it abstract)
abstract class Triangle extends Shape
{

	
}

class UpperTriangle extends Triangle
{
	@Override
	void draw() {
		System.out.println("Drawing Upper triangle");
	}	
}

class LowerTriangle extends Triangle
{
	@Override
	void draw() {
		System.out.println("Drawing Lower triangle");
	}	
}



public class Test {

	public static void main(String[] args) {
//		Shape s = new Shape(); // not allowed; can't create instance or object of Shape
		Shape s; // can create reference of Shape
		
		Circle c = new Circle();
		c.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
//		Triangle t = new Triangle(); // not allowed: as Triangle is also an abstract class
		
		UpperTriangle u = new UpperTriangle();
		u.draw();
		
		LowerTriangle l = new LowerTriangle();
		l.draw();
		
	}

}
