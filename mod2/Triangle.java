package com.ss.mod2;

public class Triangle implements Shape {

	int height;
	int base;
	int area;

	public Triangle() {

	}

	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public void calculateArea() {
		area = (height * base) / 2;

	}

	@Override
	public void display() {
		System.out.println("The area for this triangle is : " + area);

	}

}
