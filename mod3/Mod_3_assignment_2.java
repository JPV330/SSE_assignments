package com.ss.mod3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Mod_3_assignment_2 {

	public static void main(String[] args) {

		String user_app;
		String space = " ";
		String rd;
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the text you would like to append : ");
		user_app = sc.nextLine() + " ";

		try(BufferedReader buf = new BufferedReader(new FileReader("Reference/Dir2/Sub2Dir2/Test_file"));) {
			
			Files.write(Paths.get("Reference/Dir2/Sub2Dir2/Test_file"), space.getBytes(), StandardOpenOption.APPEND);
			Files.write(Paths.get("Reference/Dir2/Sub2Dir2/Test_file"), user_app.getBytes(), StandardOpenOption.APPEND);

			System.out.println("The file now reads : ");
			while ((rd = buf.readLine()) != null) {
				System.out.println();
				System.out.println(rd);
			}
			sc.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
