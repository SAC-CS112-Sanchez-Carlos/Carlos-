
public class Dice {

	public static int Throw(int d) {
		int max = 6 * d; // initializes max variable
		int min = 1 * d; // initializes min variable
		int range = (max - min) + 1; // initializes range variable
		int value = (int) (Math.random() * range) + min; // sets value to random
															// number between
															// 1*number of dice
															// (d) and 6* number
															// of dice (d)
		return value;

		
	}

}