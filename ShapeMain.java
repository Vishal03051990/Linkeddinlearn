package com.inheritance;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shape shape1=new shape();//we can not instantiate abstract class shape
		
		Rectangle rectangle1=new Rectangle(550,300);
		System.out.println("Area of rectangle :"+rectangle1.area());
		System.out.println("Perimeter of Rectangle :"+rectangle1.perimeter());
		
	}

}
