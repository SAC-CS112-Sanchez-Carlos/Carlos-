import java.util.Scanner;

public class NumberGame {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int computerNumber = 0; // assigns computer's number
		int playerGuess = 0; // assigns player's number
		int replay = 1; // assigns 0 to the variable replay
		String playerInput = "Y"; // assigns "Y" to the variable playerInput
		int rightGuesses = 0; // number of correct guesses by the player
		int wrongGuesses = 0;// number of wrong guesses by the player
		int gameCount = 0;// number of time the game has been played
		int totalGuesses = 0; // number of total guesses made
		int correctPercent = 0; // percentage of correct guesses made
		int wrongPercent = 0; // percentage of wrong guesses made

		do { // runs the program again as long as the player input Y
			
			computerNumber = 1 + (int) (Math.random() * 9);// creates a random
			// number between 1 and
			// 10
			
			System.out.printf("%s\n%s\n\n%s%n", "Welcome to Guess a Number Game!", // Welcome
																					// to
																					// the
																					// game
																					// message
																					// and
																					// ask
																					// player
																					// for
																					// their
																					// guess
					"I'm thinking of a number between 1 and 10!", "Take a guess? ");

			Scanner input = new Scanner(System.in); // create a scanner object
													// to obtain input from the
													// user

			while (replay < 4) { // keeps the loop going as long as its 3 or
									// less replays
				playerGuess = input.nextInt(); // assigns player's input to the
												// playerGuess variable

				if ((playerGuess > 0) && (playerGuess < 11) && (playerGuess == computerNumber)) {
					System.out.println("You guessed right! You win!"); // player's
																		// guess
																		// is
																		// between
																		// 1 and
																		// 10
																		// and
																		// is
																		// equal
																		// to
																		// the
																		// random
																		// number
					rightGuesses++; // adds 1 to the number of correct guesses
					break;
				} else if ((playerGuess < 0) || (playerGuess > 10)) {
					System.out.println("You didn't guess a number between 1 and 10.\r"); // prints
																							// if
																							// player's
																							// guess
																							// was
																							// not
																							// between
																							// 1
																							// and
																							// 10
					wrongGuesses++; // adds 1 to the variable wrongGuesses if
									// the answer was not guessed correctly
				} else if ((playerGuess > 0) && (playerGuess < 11) && (playerGuess < computerNumber)) {
					System.out.println("You guessed wrong. Try a higher number next time.\r"); // player's
																								// guess
																								// is
																								// between
																								// 1
																								// and
																								// 10
																								// and
																								// is
																								// less
																								// than
																								// the
																								// random
																								// number
					wrongGuesses++; // adds 1 to the variable wrongGuesses if
					// the answer was not guessed correctly
				} else if ((playerGuess > 0) && (playerGuess < 11) && (playerGuess > computerNumber)) {
					System.out.println("You guessed wrong. Try a lower number next time.\r"); // player's
																								// guess
																								// is
																								// between
																								// 1
																								// and
																								// 10
																								// and
																								// is
																								// more
																								// than
																								// the
																								// random
																								// number
					wrongGuesses++; // adds 1 to the variable wrongGuesses if
					// the answer was not guessed correctly
				}
				replay = replay + 1; // adds 1 to the replay counter
			}

			System.out.printf("\nThe number was " + computerNumber + ".\n"); // prints
																				// out
																				// computerNumber
			System.out.println("You've guessed the right answer " + rightGuesses + " times.");
			System.out.println("You've guessed the wrong answer " + wrongGuesses + " times.");

			totalGuesses = rightGuesses + wrongGuesses; //sum of right guesses and wrong guesses
			correctPercent = (rightGuesses * 100 / totalGuesses);// calculates percent of correct guesses
			wrongPercent = (wrongGuesses * 100 / totalGuesses); //calculates percent of wrong guesses

			System.out.printf("You guess the correct answer, %d, percent of the time.\n", correctPercent); // percentage
																											// of
																											// times
																											// the
																											// answer
																											// was
																											// guessed
																											// correctly
			System.out.printf("You guess the wrong answer, %d, percent of the time.", wrongPercent); // percentage
																										// of
																										// times
																										// the
																										// answer
																										// was
																										// guessed
																										// correctly

			System.out.println("\n\nWould you like to play again?\nIf yes, enter Y"); // asks
																						// player
																						// if
																						// they
																						// want
																						// to
																						// play
																						// again
																						// and
																						// asks
																						// for
																						// input
			playerInput = input.next(); // assigns player's input into the
										// variable playerInput

			if (playerInput.equalsIgnoreCase("Y")) {
				gameCount++;
				System.out.println("Let's play again!\n"); // prints
															// if
															// player
															// inputs
															// Y
				System.out.printf(
						"You have played this game, %d, times. \n************************************************\n",
						gameCount);
				replay = 1;

				try {
					Thread.sleep(1500); // pauses for 1.5 seconds before running
										// the game again
				} catch (InterruptedException ex) {
				}

			}

			if (!playerInput.equalsIgnoreCase("Y")) {
				System.out.println("Goodbye.");// prints if player inputs
												// something other than Y using
												// ! to signify opposite
			}
		} while (playerInput.equalsIgnoreCase("Y")); // continues the program
														// while plater input is
														// equal to "Y"
	}
}
