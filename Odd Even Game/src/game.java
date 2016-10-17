import javax.swing.JOptionPane;

public class game {

	public static void main(String[] args) {
		
		String keepPlaying = "Y"; // declares the variable keepPlaying

		do { 
		int correct; // declare variable correct
		int playerGuessvalue = 0;
		
		String playerGuess = JOptionPane.showInputDialog("Welcome to the Odd or Even game! Which do you choose?");

		if (playerGuess.equalsIgnoreCase("odd"))
			playerGuessvalue = 1;
		else if (playerGuess.equalsIgnoreCase("even"))
			playerGuessvalue = 2;
		
		/* calls odd or even class to choose odd or even */
		Oddoreven value = new Oddoreven();

		int compChoice = value.odd_or_even_choice();
		
		
		/* assigns 1 to variable correct if true or 2 if false */
		correct = (playerGuessvalue == compChoice) ? 1 : 2;

		if (correct == 1)
			keepPlaying = JOptionPane.showInputDialog("You are correct!\n Would you like to play again?");
		
		else if (correct == 2)
			keepPlaying = JOptionPane.showInputDialog("You are wrong!\n Would you like to play again?");
	
		}while (keepPlaying.equalsIgnoreCase("y")||(keepPlaying.equalsIgnoreCase("yes")));
		
		JOptionPane.showMessageDialog(null, "Goodbye.");

		
	}

}
