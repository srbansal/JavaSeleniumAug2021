package com.java.e.thiskeyword;

/*
4 instance variables

3 constructors
1 > empty > all 4 to 0
2 > 2 params > x,y = 0   l,b=l,b
4 > 4 params (x,y, l, b)
*/
public class Rectangle {

	float l, b;
	int x, y;
	
//	Rectangle(){
//		x = y = 0;
//		l = b = 0;
//	}
	Rectangle(){
		this(0, 0, 0, 0);
	}
	
//	Rectangle(float l, float b){
//		x = y = 0;
//		this.l = l;
//		this.b = b;
//	}
	Rectangle(float l, float b){
		this(0, 0, l, b);
	}
	
	Rectangle(int x, int y, float l, float b){
		this.x = x;
		this.y = y;
		this.l = l;
		this.b = b;
	}
	
	void show() {
		System.out.printf("%d %d %.2f %.2f\n", x, y, l, b);
	}
	
	
	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle(6, 10);
		
		obj1.show();
		obj2.show();
	}

}
