package com.ss.mod1;
import java.util.*;

public class Assignment_2 {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int guess = 1;
		boolean correct = false;
		int num = (int)Math.floor(Math.random()*(max-min+1)+min);
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Please enter your guess : ");
			int u_guess = sc.nextInt();
			
			if(Math.abs(num - u_guess) <= 10) {
				System.out.println("You were withing 10 of the number");
				System.out.println("The number is : " + num);
				correct = true;
			}else if(guess < 5){
				guess++;
				System.out.println("That is not within 10 of the number");
				System.out.println("There are " + (6 - guess) + " guess(s) left. Please try again");
			}else if(guess == 5) {
				guess = 6;
				System.out.println("You were unable to guess the number, so sorry. The Answer was : " + num);
			}
			
		}while(guess != 6 && correct != true );

	}

}
