import java.util.Scanner;

public class NumberGame {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int computerNumber; // assigns computer's number
		int playerGuess; // assigns player's number
		String playerInput; // allows for input into the variable playerInput
		
		computerNumber = 1 + (int) (Math.random() * 10);// creates a random number between 1 and 10
		
		// Welcome to the game message and ask player for their guess
		System.out.printf("%s\n%s\n\n%s", "Welcome to Guess a Number Game!",
				"I'm thinking of a number between 1 and 10!", "Take a guess? "); 

		Scanner input = new Scanner(System.in); // create a scanner object to obtain input from the user

		playerGuess = input.nextInt(); // assigns player's input to the playerGuess variable

		if ((playerGuess > 0) && (playerGuess <11) && (playerGuess == computerNumber)) {
			System.out.println("You guessed right! You win"); //player's guess is between 1 and 10 and is equal to the random number
	}
		else if ((playerGuess < 0) || (playerGuess > 10)){
			System.out.println("You didn't guess a number between 1 and 10."); //prints if player's guess was not between 1 and 10
	}
		else if ((playerGuess > 0) && (playerGuess <11) && (playerGuess < computerNumber)){
			System.out.println("You guessed wrong. Try a higher number next time."); //player's guess is between 1 and 10 and is less than the random number
	}
		else if ((playerGuess > 0) && (playerGuess <11) && (playerGuess > computerNumber)){
			System.out.println("You guessed wrong. Try a lower number next time."); //player's guess is between 1 and 10 and is more than the random number
	}
		System.out.printf("\nThe number was " + computerNumber); //prints out computerNumber
		
		System.out.println("\n\nWould you like to play again?\nIf yes, enter Y");	//asks player if they want to play again and asks for input
		playerInput = input.next(); //assigns player's input into the variable playerInput
		
		if (playerInput.equalsIgnoreCase("Y")){
		System.out.println("Run the program again."); //prints if player inputs Y
		}
		else System.out.println("Goodbye.");//prints if player inputs something other than Y
	}
}
