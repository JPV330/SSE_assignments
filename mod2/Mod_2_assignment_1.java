package com.ss.mod2;

import java.util.*;

public class Mod_2_assignment_1 {

	public static void main(String[] args) {
		//String cont = "yes";
		boolean cont = true;
		String u_entry = "add";
		int total = 0;
		int entry = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(cont == true){
			
			
			
			if(u_entry.equals("add")) {
				System.out.print("Please enter a number to add to the total : ");
				entry = sc.nextInt();
				total = total + entry;
				
				System.out.println("Enter add to add numbers, or stop to stop adding numbers : ");
				u_entry = sc.nextLine();
				System.out.println(u_entry);
				
			}else if(u_entry.equals("stop")) {
				cont = false;
				System.out.println("Thank you for adding numbers to the total");
			}
			
			System.out.print("Enter add to add numbers, or stop to stop adding numbers : ");
			u_entry = sc.nextLine();
			System.out.println("test");
			
			
		}
		
		System.out.println("your total is : " + total);

	}

}
