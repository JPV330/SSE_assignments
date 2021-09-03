package com.ss.mod2;

public class Rectangle implements Shape {

	int length;
	int width;
	int area;

	public Rectangle() {

	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void calculateArea() {
		area = length * width;

	}

	@Override
	public void display() {
		System.out.println("The area for this rectangle is : " + area);

	}

}
