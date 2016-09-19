import java.util.Random;
import java.util.Scanner;


public class computer_choice {

	public static void main(String[] args) {

		// scanner to create input from the command window
		Scanner choice = new Scanner(System.in);
		Random generator = new Random();

		// welcome prompt
		System.out.print("Welcome to Paper Scissors Rock Simulator\n\nEnter your choice: ");
		String choose1 = choice.nextLine();

		// cpu's random choice
		// 0 = paper, 1 = rock, 2 = scissors
		int random = generator.nextInt(3);

		// compare player choice and computer choice and print win, lose, or tie
		if (random == 0 && choose1.equalsIgnoreCase("paper"))
			System.out.println("The computer's choice was paper.\n\nYou tied.");

			else if (random == 0 && choose1.equalsIgnoreCase("rock"))
			System.out.println("The computer's choice was paper.\n\nYou lose.");

			else if (random == 0 && choose1.equalsIgnoreCase("scissors"))
			System.out.println("The computer's choice was paper.\n\nYou win!");

		if (random == 1 && choose1.equalsIgnoreCase("paper"))
			System.out.println("The computer's choice was rock.\n\nYou win!");

			else if (random == 1 && choose1.equalsIgnoreCase("scissors"))
			System.out.println("The computer's choice was rock.\n\nYou lose.");

			else if (random == 1 && choose1.equalsIgnoreCase("rock"))
			System.out.println("The computer's choice was rock.\n\nYou tied.");

		if (random == 2 && choose1.equalsIgnoreCase("paper"))
			System.out.println("The computer's choice was scissors.\n\nYou lose.");

			else if (random == 2 && choose1.equalsIgnoreCase("scissors"))
			System.out.println("The computer's choice was scissors.\n\nYou tied.");

			else if (random == 2 && choose1.equalsIgnoreCase("rock"))
			System.out.println("The computer's choice was scissors.\n\n You win!");

	}
}