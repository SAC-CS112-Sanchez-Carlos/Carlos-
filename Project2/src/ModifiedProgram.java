//Displaying multiple lines of text with a single statement


import java.util.Scanner; //program uses class Scanner

public class ModifiedProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int number1; //first number to add
		int number2; //second number to add	
		
		System.out.print("Enter your first integer: "); //prompt
		number1 = input.nextInt(); //read first number from user
		
		System.out.print("Enter your second integer: "); //prompt
		number2 = input.nextInt(); //read second number from user
		
		if ( number1 == number2 )
			System.out.printf("%d == &d\n", number1, number2); //display number1 and number2
		
		if (number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);
	}

}
