import java.io.PrintStream;

public class distanceTravel extends Automobile {
	int distanceTravel;

	public void distanceTravel() { // sets distance traveled based on current
									// gear and operating cycle
		int counter = 1;
		while (counter <= operatingCycleInput) {
			if (counter < currentGear) {
				distanceTravel += (counter * 10);
			} else {
				distanceTravel += (currentGear * 10);
			}
			System.out.printf("The distance traveled is %d on operating cycle %d.\n", distanceTravel, counter);
			counter++;
		}
	}

	public PrintStream About() { // prints out the list of variables set by the
									// user
		return (System.out.printf(
				"The %s is a %d, %s, %s %s. It is in gear %d. It's current speed is %d mph. The total distance travelled was %d miles.\n\n",
				nameInput, yearInput, colorInput, makeInput, modelInput, gearsInput, currentSpeed, distanceTravel));
	}

}
