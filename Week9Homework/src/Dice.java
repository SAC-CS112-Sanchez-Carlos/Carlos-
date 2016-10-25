
public class Dice {

	private int roll;
	private int numberOfDice;
	private int value;

	public Dice(int d) {
		numberOfDice = d;
	}

	int setNumberOfDice(int d) {
		int max = 6 * d;
		int min = 1 * d;
		int range = (max - min) + 1;
		value = (int) (Math.random() * range) + min;
		return value;
	}

}