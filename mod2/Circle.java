package com.ss.mod2;

public class Circle implements Shape {

	int radius;
	int area;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		area = (int)Math.floor((radius * radius) * Math.PI);

	}

	@Override
	public void display() {
		System.out.println("The area of the cirle is : " + area);
		

	}

}
