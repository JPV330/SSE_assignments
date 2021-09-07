package com.ss.mod3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Mod_3_assignment_1 {

	public static void main(String[] args) {
		
		try {
			Files.walk(Paths.get("Reference")).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
