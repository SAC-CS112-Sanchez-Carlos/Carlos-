
import javax.swing.JOptionPane;

public class Game {

	public static void main(String[] args) {

		String keepPlaying = "Y"; // declares the variable keepPlaying as "Y"
									// for yes
		int number = 0; // declare variable number for computer's number
						// choice
		int correct; // declare variable correct

		do {

			int numberOfGuesses = 1; // declare variable tries

			/*
			 * displays an input dialog box requesting a guess from the player
			 */
			String guess = JOptionPane.showInputDialog(
					"Welcome to the Guess a number game!\nI'm thinking of a number between 1 and 10!\nWhat is my number?");
			int playerGuess = Integer.parseInt(guess); // changes the string to
														// an int

			number = 1 + (int) (Math.random() * 9); // computer chooses random
													// number

			while (numberOfGuesses < 3) { // allows for for 3 guesses

				correct = (playerGuess == number) ? 1 : 2; // assigns 1 to
															// variable
															// correct if true
															// or 2
															// if false

				/*
				 * outputs the "You Win" dialogue if the player guessed the
				 * correct random number
				 */
				if (correct == 1) {
					String win = String.format("You are correct! You win!");
					JOptionPane.showMessageDialog(null, win);
					numberOfGuesses = 3;
					break;
				}
				/*
				 * displays a dialogue box telling the player their guess was
				 * too big and asking them to guess again
				 */
				else if ((correct == 2) && (playerGuess > number)) {
					String bigGuess = JOptionPane.showInputDialog("Your number was too big. Guess again.");
					playerGuess = Integer.valueOf(bigGuess);
					numberOfGuesses++;
				}
				/*
				 * displays a dialogue box telling the player their guess was
				 * too small and asking them to guess again
				 */
				else if ((correct == 2) && (playerGuess < number)) {
					String smallGuess = JOptionPane.showInputDialog("Your number was too small. Guess again.");
					playerGuess = Integer.valueOf(smallGuess);
					numberOfGuesses++;
				}
			}

			/* displays the answer in a dialogue box */
			String answer = String.format("The answer is %d.", number);
			JOptionPane.showMessageDialog(null, answer);

			/*
			 * displays an input dialog box asking the player if they would like
			 * to keep playing and requesting input
			 */
			keepPlaying = JOptionPane.showInputDialog("Would you like to play again? Enter Y or N");

			/*
			 * outputs goodbye message if the player chooses not to continue
			 * playing
			 */
			if (!keepPlaying.equalsIgnoreCase("Y")) {
				String goodbye = String.format("Thanks for playing. Goodbye.");
				JOptionPane.showMessageDialog(null, goodbye);
			}
			/*
			 * allows the player to continue playing until they choose "N" or no
			 */
		} while (keepPlaying.equalsIgnoreCase("Y"));
	}
}