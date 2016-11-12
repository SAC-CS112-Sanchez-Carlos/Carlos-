import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // call scanner method

		/* asks user to input number of dice rolled */
		System.out.println("How many dice would you like to roll?");

		int d = input.nextInt(); // takes input and assigns it to int d

		Dice dice1 = new Dice(); // creates new Dice called dice1

		int totalOperatingCycles = Dice.Throw(d); // assigns the dice roll with
													// the user's choice number
													// of dice to the variable
													// diceroll

		/* prints Dice.throw */
		System.out.printf("The dice rolled a %d.\n\n", totalOperatingCycles);

		/* creates a new automobile called truck */
		distanceTravel Truck = new distanceTravel();

		Truck.setGears(3);
		Truck.setYear(1999);
		Truck.setColor("Blue");
		Truck.setMake("Toyota");
		Truck.setModel("Tacoma");
		Truck.setName("Truck");
		Truck.setOperatingCycle(totalOperatingCycles);
		Truck.currentGear();
		Truck.currentSpeed();
		Truck.distanceTravel();
		Truck.About();

		/* creates a new automobile called Van */
		distanceTravel Van = new distanceTravel();

		Van.setGears(4);
		Van.setYear(2001);
		Van.setColor("Burgundy");
		Van.setMake("Toyota");
		Van.setModel("Sienna");
		Van.setName("Van");
		Van.setOperatingCycle(totalOperatingCycles);
		Van.currentGear();
		Van.currentSpeed();
		Van.distanceTravel();
		Van.About();

		/* creates a new automobile called Sport */
		distanceTravel Sport = new distanceTravel();

		Sport.setGears(6);
		Sport.setYear(1996);
		Sport.setColor("Red");
		Sport.setMake("Toyota");
		Sport.setModel("Celica");
		Sport.setName("Sport Car");
		Sport.setOperatingCycle(totalOperatingCycles);
		Sport.currentGear();
		Sport.currentSpeed();
		Sport.distanceTravel();
		Sport.About();

	}
}