package com.ss.mod2;

import com.ss.mod2.Rectangle;
import com.ss.mod2.Triangle;
import com.ss.mod2.Circle;

public class Mod_2_assignment_3 {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(5, 8);
		rect.calculateArea();
		rect.display();
		System.out.println();

		Triangle tri = new Triangle(9, 27);
		tri.calculateArea();
		tri.display();
		System.out.println();

		Circle circ = new Circle(9);
		circ.calculateArea();
		circ.display();
		System.out.println();

	}

}
