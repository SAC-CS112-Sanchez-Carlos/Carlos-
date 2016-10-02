
import javax.swing.JOptionPane;

public class Game {

	public static void main(String[] args) {

			String keepPlaying = "Y";
			int number = 0; // declare variable number for computer's number
							// choice
			int correct; // declare variable correct
			
			do{
			int numberOfGuesses = 1; // declare variable tries			

			String guess = JOptionPane.showInputDialog(
					"Welcome to the Guess a number game!\nI'm thinking of a number between 1 and 10!\nWhat is my number?");
			int playerGuess = Integer.parseInt(guess);
			
			number = 1 + (int) (Math.random() * 9); // computer chooses random
													// number
			while (numberOfGuesses < 3) {

				correct = (playerGuess == number) ? 1 : 2; // assigns 1 to
															// variable
															// correct if true
															// or 2
															// if false

				if (correct == 1) {String win = 
							String.format("You are correct! You win!");
							JOptionPane.showMessageDialog(null, win);
							numberOfGuesses = 3;
							break;
							} 
				else if ((correct==2)&&(playerGuess>number)) {String bigGuess = 
						JOptionPane.showInputDialog("Your number was too big. Guess again.");
						playerGuess = Integer.valueOf(bigGuess);
						numberOfGuesses++;
				}
				else if ((correct==2)&&(playerGuess<number)) {String smallGuess = 
						JOptionPane.showInputDialog("Your number was too small. Guess again.");
						playerGuess = Integer.valueOf(smallGuess);
						numberOfGuesses++;
				}
			}
			
			String answer = String.format("The answer is %d.", number);
			JOptionPane.showMessageDialog(null, answer);
			
			keepPlaying = JOptionPane.showInputDialog("Would you like to play again? Enter Y or N");

			if (!keepPlaying.equalsIgnoreCase("Y")){String goodbye = String.format("Thanks for playing. Goodbye.");
				JOptionPane.showMessageDialog(null, goodbye);
			}
			}while (keepPlaying.equalsIgnoreCase("Y"));
	}
}