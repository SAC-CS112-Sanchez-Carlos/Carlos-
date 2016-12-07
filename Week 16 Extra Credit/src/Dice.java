
public class Dice{

	public static int Throw() {
		int value = (int) (6 * Math.random()) + 1; // rolls random dice value
													// between 1 and 6
		return value;
	}

	public static int Throw(int d) { // rolls number of dice based on d
		int counter = 0;
		int sum = 0;
		while (counter < d) {
			sum += Throw();
			counter++;
		}
		return sum;
	}


}