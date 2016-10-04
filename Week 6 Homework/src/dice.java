
import java.util.Arrays;

import javax.swing.JOptionPane;

public class dice {

	public static void main(String[] args) {

		String response;

		int wins = 0; // variable for how many wins
		int losses = 0; // variable for how many losses
		int gamesplayed = 0; // variable for how many times the game has been
								// played
		int numberodds = 0; // variable for how many times the dice has rolled
							// an odd number
		int numberevens = 0; // variable for how many times the dice has rolled
								// an even number

		do { // loops game based on while condition

			int diceroll = 1 + (int) (Math.random() * 6); // rolls number
															// between 1 and 6


			/* asks player whether they think the dice rolled even or odd */
			String odd_or_even = JOptionPane
					.showInputDialog("The dice was rolled. Do you think the answer was odd or even?");
			String guess = String.valueOf(odd_or_even);

			/*
			 * assigns odd to variable dice if it rolled 1,3, or 5; otherwise
			 * assigns even
			 */
			String dice = (diceroll == 1) || (diceroll == 3) || (diceroll == 5) ? "odd" : "even";

			/* adds to the even or odd counter based on dice roll */
			if ((diceroll == 1) || (diceroll == 3) || (diceroll == 5)) {
				numberodds++;
			} else if ((diceroll == 2) || (diceroll == 4) || (diceroll == 6)) {
				numberevens++;
			}

			/*
			 * displays win message if player guess and dice roll even/odd
			 * status match
			 */
			if (dice.equalsIgnoreCase(guess)) {
				String win = String.format("You are correct! You win!");
				JOptionPane.showMessageDialog(null, win);
				wins++;
			}

			/*
			 * displays lose message if player guess and dice roll even/odd
			 * status differ
			 */
			else if (!dice.equalsIgnoreCase(guess)) {
				String lose = String.format("You are wrong! You lose!");
				JOptionPane.showMessageDialog(null, lose);
				losses++;
			}

			/* adds 1 to the gamesplayed counter after every game played */
			gamesplayed++;


			/*calculates win percentage*/
			int winpercent = (wins * 100)/gamesplayed;
			
			
			/*displays game history*/
			String[] history = new String[4];
			
			history[0] = "Wins: " + wins;
			history[1] = "\nLosses: " + losses;
			history[2] = "\nNumber of odds rolled:" + numberodds + "\nNumber of evens rolled: "+ numberevens;
			history[3] = "\nWin percentage: " + winpercent;
			
		    JOptionPane.showMessageDialog(null, Arrays.toString(history));
			
			/*
			 * displays input message asking if the player would like to play
			 * again
			 */
			String playAgain = JOptionPane.showInputDialog("Would you like to play again?");
			response = String.valueOf(playAgain);

			/*
			 * displays goodbye message if player inputs something other than
			 * yes
			 */
			if (!playAgain.equalsIgnoreCase("yes")) {
				String later = String.format("Goodbye.");
				JOptionPane.showMessageDialog(null, later);

			}

			/* loops game as long as the player inputs some variation of yes */
		} while (response.equalsIgnoreCase("yes"));

	}
}
