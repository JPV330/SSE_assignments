package com.ss.mod2;

import com.ss.mod2.Shape;

public class Mod_2_assignemnt_shapes {

	class Rectangle_ implements Shape {

		int length;
		int width;
		int area;

		public Rectangle_() {

		}

		public Rectangle_(int length, int width) {
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

	class Triangle implements Shape {

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

	class Circle implements Shape {

		int radius;
		double area;

		public Circle() {

		}

		public Circle(int radius) {
			this.radius = radius;
		}

		@Override
		public void calculateArea() {
			area = (radius * radius) * Math.PI;

		}

		@Override
		public void display() {
			System.out.println("The area ");

		}

	}

}
