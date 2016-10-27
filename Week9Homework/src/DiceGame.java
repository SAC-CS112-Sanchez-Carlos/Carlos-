import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
	int value = 0; // declares and initializes variable roll
	int points = 0; //declares and initializes variable points
	int tries = 0;	//declares int tries
	String response = "Y"; //declares int response

	do{
		/* asks user for input of number of dice to roll */
		System.out.printf("How many dice do you want to roll?\n");

		Scanner input = new Scanner(System.in); // assigns

		/* assigns user input to numberOfDice */
		int numberOfDice = input.nextInt();

		Dice dice1 = new Dice(numberOfDice); // calls method Dice

		/*rolls the dice based on the player's choice of numberOfDice*/
		int roll = dice1.setNumberOfDice(numberOfDice);
		
		/*asks user for dice roll guess*/
		System.out.printf("Guess what number the dice rolled?\n");

		/*takes in 2nd input from user*/
		int guess = input.nextInt();

		
		if (guess==roll){
			System.out.println("You are correct!\n+1 point"); //response if user guesses correct
			points++;
		}
		else {
		System.out.println("You are incorrect. Guess again.");//response if user guesses incorrect
		}
		/*output what the dice rolled*/
		System.out.println("The dice roll turned up " + roll + "."
				+ "\nYour current point total is: " + points);
		
		System.out.println("Do you want to play again?");//seeks input from user on whether to play again
		response = input.next();//assigns input to response
	
		/*continues if Y or Yes are entered*/
	}while (response.equalsIgnoreCase("Y") || (response.equalsIgnoreCase("Yes")));
	
	System.out.println("Goodbye."); //prints goodbye if user chooses to type something besides y or yes
	}
}
