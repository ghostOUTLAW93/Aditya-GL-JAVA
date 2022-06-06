package com.greatlearning.corejava;

public class InheritanceC extends InheritanceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object in multilevel inheritance
		InheritanceC obj= new InheritanceC();
		obj.area(5.2);
		obj.area(6, 9);
		obj.area(4, 6);
		System.out.println(obj.speedLimit);

	}
	void area(int base, int height) {
		float area= (float) (0.5*base* height);
		System.out.println("Area of triangle is= "+area);
	}

}

class InheritanceB extends InheritanceA{
	void area(int length, int breadth) {
		float area= length*breadth;
		System.out.println("Area of rectangle is= "+area);
	}
}

class InheritanceA{
	final float pi= 22/7f;
	protected int speedLimit=80;
	void area(double radius) {
		float area= (float) (pi*(Math.pow(radius, radius)));
		System.out.println("Area of circle is= "+ area);
	}
}
