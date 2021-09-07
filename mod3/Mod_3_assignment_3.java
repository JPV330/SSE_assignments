package com.ss.mod3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Mod_3_assignment_3 {

	public static void main(String[] args) {

		char u_char;
		char compare;
		String data = "";
		int count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print(
				"Please enter the character you wish to count, only the first character enter will be counted : ");
		u_char = sc.next().charAt(0);

		try (BufferedReader buf = new BufferedReader(new FileReader("Reference/Dir3/Assignemnt_3_text"));) {

			while ((data = buf.readLine()) != null) {
				for (int i = 0; i < data.length(); i++) {
					compare = data.charAt(i);
					if (compare == u_char) {
						count++;
					}

				}
			}

			System.out.print("The total number of characters given was : " + count);
			sc.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
