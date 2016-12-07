import java.util.Scanner;

public class racing {

	public static void main(String[] args) throws Exception {

		/*creates new instance of automobile called Truck*/
		Automobile Truck = new Automobile(1999, "Toyota", "Tacoma", "Blue", "Trucky", 3); 
		
		/*creates new instance of automobile called Van*/
		Automobile Van = new Automobile(2001, "Toyota", "Sienna", "Burgendy", "Vanny", 4);
		
		/*creates new instance of automobile called Sportcar*/
		Automobile Sportcar = new Automobile(1996, "Toyota", "Celica", "Red", "Sporty", 6);
		
	
		Scanner input = new Scanner(System.in); // new scanner object input
		
		/*asks user for input*/
		System.out.println("How many dice would you like to roll?"); 
		
		
		int choice = input.nextInt(); // assigns user input to variable choice

		/*assigns dice roll of user choice dice to RaceCycles*/
		int RaceCycles = Dice.Throw(choice);
		
		String RaceStatus = ""; // declares variable RaceStatus

		for (int cycle = 1; cycle <= RaceCycles; cycle++) { //loop start
			
			try{
			
				/*sets operating cycles based on dice roll for 3 automobiles*/
			Truck.setOperatingCycle(cycle);
			Van.setOperatingCycle(cycle);
			Sportcar.setOperatingCycle(cycle);
		
			//end for loop
			} catch (Exception e) {  //prints yellow flag warning if exception is thrown
				System.out.println("Yellow Flag Warning!");
			}
		}
		Thread t1 = new Thread(Truck);
		t1.start();

		Thread t2 = new Thread(Van);
		t2.start();

		Thread t3 = new Thread(Sportcar);
		t3.start();

		System.out.println("");
		
		float carSum = (Truck.getDistanceTraveled() + Van.getDistanceTraveled() + Sportcar.getDistanceTraveled());
		
		System.out.println("Total distance = " + carSum + ".");
				
		System.out.println("\nGoodbye!");
			}
}
	
