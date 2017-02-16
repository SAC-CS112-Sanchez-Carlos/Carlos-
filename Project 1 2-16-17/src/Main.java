import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//creates new hexagon method
		Hexagon Hex1 = new Hexagon();
		
		//creates new octagon method
		Octagon Oct1 = new Octagon();
		
		//creates new pentagon method
		Pentagon Pent1 = new Pentagon();
		
		//creates new triangle method
		Triangle Tri1 = new Triangle();
		
		//creates new quadrilateral method
		Quadrilateral Quad1 = new Quadrilateral();	
		
		//creates new scanner method
		Scanner input = new Scanner(System.in); 
		
		//asks user to choose a polygon
		System.out.println("Choose a polygon: ");  
		
		//next user input is assigned to variable shape
		String shape = input.nextLine();
		
		//checks if shape is "hexagon" and asks for length of side
		if (shape.equalsIgnoreCase("hexagon")){
			System.out.println("What is the length of the side?");
			
			//assigns user input of to variable length
			double length = input.nextDouble();
			
			//sets length using method setSide
			Hex1.setSide(length);
			
			//prints area and perimeter based on length
			System.out.println("The area is " + Hex1.area() + ".\nThe perimeter is " + Hex1.perimeter() + ".");
		}
		
		//checks if shape is "octagon" and asks for length of side
		else if (shape.equalsIgnoreCase("octagon")){
			System.out.println("What is the length of the side?");
			
			//assigns user input of to variable length
			double length = input.nextDouble();
			
			//sets length using method setSide
			Oct1.setSide(length);
			
			//prints area and perimeter based on length
			System.out.println("The area is " + Oct1.area() + "." + "\nThe perimeter is " + Oct1.perimeter() + ".");
			}
		
		//checks if shape is "pentagon" and asks for length of side
		else if (shape.equalsIgnoreCase("pentagon")){
			System.out.println("What is the length of the side?");
			
			//assigns user input of to variable length
			double length = input.nextDouble(); 
			
			//sets length using method setSide
			Pent1.setSide(length); 
			
			//prints area and perimeter based on length
			System.out.println("The area is " + Pent1.area() + "." + "\nThe perimeter is " + Pent1.perimeter() + ".");
		}
		
		//checks if shape is "quadrilateral" and asks for length of sides
		else if (shape.equalsIgnoreCase("quadrilateral")){
			System.out.println("What is length of side 1?");
			double side1 = input.nextDouble();
			Quad1.setSide1(side1);
			
			System.out.println("What is length of side 2?");
			double side2 = input.nextDouble();
			Quad1.setSide2(side2);

			System.out.println("What is length of side 3?");
			double side3 = input.nextDouble();
			Quad1.setSide3(side3);
			
			System.out.println("What is length of side 4?");
			double side4 = input.nextDouble();
			Quad1.setSide4(side4);

			System.out.println("What is length of angle A?");
			double angleA = input.nextDouble();
			Quad1.setAngleA(angleA);

			System.out.println("What is length of opposite angle B?");
			double angleB = input.nextDouble();
			Quad1.setAngleB(angleB);
			
			System.out.println("The area is " + Quad1.area() + "." + "\nThe perimeter is " + Quad1.perimeter() + ".");
		}
	}
}

