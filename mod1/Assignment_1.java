package com.ss.mod1;

public class Assignment_1 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print(System.lineSeparator());
		}
		for(int a = 0; a < 9; a++) {
			System.out.print(".");
		}
		
		System.out.println();
		for(int a = 0; a < 9; a++) {
			System.out.print(".");
		}
		System.out.println();
		
		for(int i = 5; i > 1; i = i - 1) {
			for(int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.print(System.lineSeparator());
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			for(int j = 5 - i; j > 1; j--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < 2*(i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a = 0; a < 9; a++) {
			System.out.print(".");
		}
		System.out.println();
		
		for(int a = 0; a < 9; a++) {
			System.out.print(".");
		}
		System.out.println();
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			
			for(int j = 8; j > 2*(i)+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
