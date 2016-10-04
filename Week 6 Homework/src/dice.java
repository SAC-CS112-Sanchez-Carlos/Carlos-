import javax.swing.JOptionPane;

public class dice {

	public static void main(String[] args) {

		String response;
	
		int wins=0;
		int losses=0;
		int gamesplayed=0;
		int numberodds=0;
		int numberevens=0;
		
		do{
			
		int diceroll = 1 + (int) (Math.random() * 6);
		
		String dicerollanswer = String.valueOf(diceroll);
				JOptionPane.showMessageDialog(null, dicerollanswer);
		
		String odd_or_even = 
				JOptionPane.showInputDialog("The dice was rolled. Do you think the answer was odd or even?");
		String guess = String.valueOf(odd_or_even);
				
		String dice = (diceroll == 1)||(diceroll==3)||(diceroll==5) ? "odd" : "even";

		if ((diceroll == 1)||(diceroll==3)||(diceroll==5)) {
			numberodds++;
		}
			else if ((diceroll == 2)||(diceroll==4)||(diceroll==6)){
				numberevens++;
			}
		
		if (dice.equalsIgnoreCase(guess)) {
			String win = String.format("You are correct! You win!");
			JOptionPane.showMessageDialog(null, win);
			wins++;
		}
		
		else if(!dice.equalsIgnoreCase(guess)) {
			String lose = String.format("You are wrong! You lose!");
			JOptionPane.showMessageDialog(null, lose);
			losses++;
		}

		gamesplayed++;
		
		String ratio = String.format("You have won %d times and lost %d times.", wins, losses);
		JOptionPane.showMessageDialog(null, ratio);
		
		String played = String.format("You have played %d game(s).", gamesplayed);
		JOptionPane.showMessageDialog(null, played);
		
		String oddsandevens = String.format("The system has generated %d odd and %d evens.", numberodds, numberevens);
		JOptionPane.showMessageDialog(null, oddsandevens);
		
		String playAgain = 
				JOptionPane.showInputDialog("Would you like to play again?");
		response = String.valueOf(playAgain);
		if (!playAgain.equalsIgnoreCase("yes")) {String later = String.format("Goodbye.");
		JOptionPane.showMessageDialog(null, later);
		
		
		}
		
		}while(response.equalsIgnoreCase("yes"));
	
	}
}
