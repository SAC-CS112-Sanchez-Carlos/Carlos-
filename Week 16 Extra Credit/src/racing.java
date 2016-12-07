import java.util.Scanner;

public class racing {

	public static void main(String[] args) throws Exception {

		/* creates new instance of automobile called Truck */
		Automobile Truck = new Automobile(1999, "Toyota", "Tacoma", "Blue", "Trucky", 3);

		/* creates new instance of automobile called Van */
		Automobile Van = new Automobile(2001, "Toyota", "Sienna", "Burgendy", "Vanny", 4);

		/* creates new instance of automobile called Sportcar */
		Automobile Sportcar = new Automobile(1996, "Toyota", "Celica", "Red", "Sporty", 6);

		Scanner input = new Scanner(System.in); // new scanner object input

		/* asks user for input */
		System.out.println("How many dice would you like to roll?");

		int choice = input.nextInt(); // assigns user input to variable choice

		/* assigns dice roll of user choice dice to RaceCycles */
		int RaceCycles = Dice.Throw(choice);

		String RaceStatus = ""; // declares variable RaceStatus

		for (int cycle = 1; cycle <= RaceCycles; cycle++) { // loop start

			/* sets operating cycles based on dice roll for 3 automobiles */
			Truck.setOperatingCycle(cycle);
			Van.setOperatingCycle(cycle);
			Sportcar.setOperatingCycle(cycle);

		} // end for loop

		try {
			Thread t1 = new Thread(Truck); // instantiates new thread t1
			t1.start();// starts thread

			synchronized (t1) {
				Thread t2 = new Thread(Van); // instantiates new thread t2
				t2.start();// starts thread
			}

			synchronized (t1) {
				Thread t3 = new Thread(Sportcar); // instantiates new thread t3
				t3.start();// starts thread
			}
		} catch (Exception e) { // prints yellow flag warning if exception is
								// thrown
			System.out.println("Yellow Flag Warning!");
		}
		
		System.out.println("");

		/* adds together distance of automobiles */
		float carSum = (Truck.getDistanceTraveled() + Van.getDistanceTraveled() + Sportcar.getDistanceTraveled());

		/* prints total distance */
		System.out.println("Total distance = " + carSum + ".");

		/* prints goodbye */
		System.out.println("\nGoodbye!");
	}
}
