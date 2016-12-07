import java.util.Scanner;

public class racing {

	public static void main(String[] args) throws Exception {

		Automobile Truck = new Automobile(1999, "Toyota", "Tacoma", "Blue", "Trucky", 3); // creates
																							// new
																							// instance
																							// of
																							// automobile
																							// called
																							// Truck
		Automobile Van = new Automobile(2001, "Toyota", "Sienna", "Burgendy", "Vanny", 4); // creates
																							// new
																							// instance
																							// of
																							// automobile
																							// called
																							// Van
		Automobile Sportcar = new Automobile(1996, "Toyota", "Celica", "Red", "Sporty", 6); // creates
																							// new
																							// instance
																							// of
																							// automobile
																							// called
																							// Sportcar

		Scanner input = new Scanner(System.in); // new scanner object input
		System.out.println("How many dice would you like to roll?"); // asks
																		// user
																		// for
																		// input
		int choice = input.nextInt(); // assigns user input to variable choice

		int RaceCycles = Dice.Throw(choice); // assigns dice roll of 2 dice to
												// RaceCycles
		String RaceStatus = ""; // declares variable RaceStatus

		for (int cycle = 1; cycle <= RaceCycles; cycle++) {
			Truck.setOperatingCycle(cycle);
			Van.setOperatingCycle(cycle);
			Sportcar.setOperatingCycle(cycle);
		}
		long startTime = System.currentTimeMillis();
		long patience = 1000 * 60 * 60;
		
		Thread t1 = new Thread(Truck);
		t1.start();

		while (t1.isAlive()) {
			t1.join(1000);
			if (((System.currentTimeMillis() - startTime) > patience) && t1.isAlive()) {
				t1.interrupt();
				// Shouldn't be long now
				// -- wait indefinitely
				t1.join();
			}

			Thread t2 = new Thread(Van);
			t2.start();

			Thread t3 = new Thread(Sportcar);
			t3.start();

			while (t2.isAlive()) {
				t2.join(1000);
				if (((System.currentTimeMillis() - startTime) > patience) && t1.isAlive()) {
					t2.interrupt();
					// Shouldn't be long now
					// -- wait indefinitely
					t2.join();
				}
				System.out.println("");
				float carSum = (Truck.getDistanceTraveled() + Van.getDistanceTraveled() + Sportcar.getDistanceTraveled());
				System.out.println("Total vehicle distance = " + carSum + ".");
				
				try {
					for (int cycle = 1; cycle <= RaceCycles; cycle++) { // loops
																		// based
																		// on
																		// operating
																		// cycle

						// Truck.setOperatingCycle(cycle);
						// Van.setOperatingCycle(cycle);
						// Sportcar.setOperatingCycle(cycle);

						RaceStatus = Truck.getName() + ":" + " Current gear = " + Truck.getGear() + " Current speed = "
								+ Truck.getSpeed() + "\t";

						RaceStatus += Van.getName() + ":" + " Current gear = " + Van.getGear() + " Current speed = "
								+ Van.getSpeed() + "\t";

						RaceStatus += Sportcar.getName() + ":" + " Current gear = " + Sportcar.getGear()
								+ " Current speed = " + Sportcar.getSpeed() + "\t";

						System.out.println("Race Cycle: " + cycle);
						System.out.println(RaceStatus);
					} // end loop

					/*
					 * assigns names of objects and distance traveled of each to
					 * RaceStatus
					 */
					float sum = Sportcar.getDistanceTraveled() + Truck.getDistanceTraveled()
							+ Van.getDistanceTraveled();
					RaceStatus = Truck.getName() + ":" + " Distance Traveled = " + Truck.getDistanceTraveled() + "\t";
					RaceStatus += Van.getName() + ":" + " Distance Traveled = " + Van.getDistanceTraveled() + "\t";
					RaceStatus += Sportcar.getName() + ":" + " Distance Traveled = " + Sportcar.getDistanceTraveled()
							+ "\t";
					RaceStatus += "Total Distance of all vehicles = " + sum;

				} catch (Exception e) {
					System.out.println("Yellow Flag Warning!");
				}

				/* prints distance of each automobile */
				System.out.println("\n" + RaceStatus);

				/* prints info of Object based on toString method */
				System.out.println(Truck.toString());
				System.out.println(Van.toString());
				System.out.println(Sportcar.toString());
				System.out.println("\nGoodbye!");
			}

		}

	}
}