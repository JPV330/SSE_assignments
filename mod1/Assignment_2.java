package com.ss.mod1;
import java.util.*;

public class Assignment_2 {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int guess = 1;
		boolean correct = false;
		//Program chooses random number
		int num = (int)Math.floor(Math.random()*(max-min+1)+min);
		Scanner sc = new Scanner(System.in);
		
		//Main loop to run while user is guessing
		do {
			System.out.print("Please enter your guess : ");
			int u_guess = sc.nextInt();
			
			//Cheeck for if guess is +/- 10 of the chosen number
			if(Math.abs(num - u_guess) <= 10) {
				//option for correct guess
				System.out.println("You were withing 10 of the number");
				System.out.println("The number is : " + num);
				correct = true;
			}else if(guess < 5){
				//option for inccorect guess
				guess++;
				System.out.println("That is not within 10 of the number");
				System.out.println("There are " + (6 - guess) + " guess(s) left. Please try again");
			}else if(guess == 5) {
				//option if user runs out of guesses
				guess = 6;
				System.out.println("You were unable to guess the number, so sorry. The Answer was : " + num);
			}
			
		}while(guess != 6 && correct != true );

	}

}
