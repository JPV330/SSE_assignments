package com.ss.mod2;

import java.util.Scanner;

public class Mod_2_assignment_2 {

	public static void main(String[] args) {
		int min = 1;
		int max = 500;
		int d1;
		int d2;
		int entry;
		int biggest = 0;
		String location = null;

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the size of the first dimension of the array : ");
		d1 = sc.nextInt();

		System.out.print("Please enter the size of the second dimension of the array : ");
		d2 = sc.nextInt();

		int[][] user_array = new int[d1][d2];

		for (int i = 0; i < d1; i++) {
			for (int j = 0; j < d2; j++) {
				entry = (int) Math.floor(Math.random() * (max - min + 1) + min);
				user_array[i][j] = entry;
			}
		}

		System.out.println("This is the array created : ");

		for (int a = 0; a < d1; a++) {
			for (int b = 0; b < d2; b++) {
				System.out.print(user_array[a][b] + " ");
			}
			System.out.println();
		}

		for (int c = 0; c < d1; c++) {
			for (int d = 0; d < d2; d++) {
				if (user_array[c][d] > biggest) {
					biggest = user_array[c][d];
					location = "The location is row : " + c + ", column : " + d;
				}
			}
		}

		sc.close();
		System.out.println();

		System.out.println("The largest number is : " + biggest);
		System.out.println(location);

	}

}
