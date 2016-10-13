package midterm2;

import java.util.Scanner;

public class CS112MidTerm {

	public static void main(String[] args) {

		String response = "yes"; //assigns yes to the variable response
		int win = 0; //initialized variable win
		int lose = 0; //initialized variable lose

		do {

			int dice1 = 1 + (int) (Math.random() * 6); // computer chooses
														// random number between
														// 1 and 6
			int dice2 = 1 + (int) (Math.random() * 6); // computer chooses
														// random number between
														// 1 and 6

			int sum = dice1 + dice2; // adds the dice sums

			/*
			 * asks player to choose between low or high based on the sum they
			 * think
			 */
			
			/*Greeting text asking player to guess between high or low*/
			System.out.println("Two die have been rolled. Is their sum low (2-6) or high (7-12)?");
			
			Scanner input = new Scanner(System.in); // new scanner
			
			String guess = input.next(); // assigns input to guess variable

			
			if ((sum > 6) && (guess.equalsIgnoreCase("high"))) {
				System.out.println("The answer was high. You're right!");//prints sum is high and player guessed high
				win++;
			} else if ((sum > 6) && (!guess.equalsIgnoreCase("high"))) {
				System.out.println("The answer was high. You're wrong!");//prints sum is high and player guessed low
				lose++;
			} else if ((sum <= 6) && (guess.equalsIgnoreCase("low"))) {
				System.out.println("The answer was low. You're right!");//prints sum is low and player guessed low
				win++;
			} else if ((sum <= 6) && (!guess.equalsIgnoreCase("low"))) {
				System.out.println("The answer was low. You're wrong!");//prints sum is low and player guessed high
				lose++;
			}
			System.out.println("Would you like to play again?");//asks player if they want to play again
			Scanner input2 = new Scanner(System.in); //new input
			response = input2.next();//assigns input to variable response

			/*loops based on the condition that player responds yes or y*/
		} while ((response.equalsIgnoreCase("yes")) || (response.equalsIgnoreCase("y"))); 
	
		int total = win + lose; //adds wins and losses
		
		int winPercentage = win * 100 / total; // finds win percentage and
												// assigns it to the variable
												// winPercentage
		
		System.out.println("Your win percentage was " + winPercentage + "."); //prints win percentage
		System.out.println("Goodbye.");// prints goodbye
	}
}
