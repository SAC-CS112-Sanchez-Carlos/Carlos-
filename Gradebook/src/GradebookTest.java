//GradebookTest.java
/**Create a Gradebook object and pass a String to its displayMessage method*/

import java.util.Scanner; //program uses Scanner

public class GradebookTest 
{
	//main method begins program execution
	public static void main(String[] args) 
	{
		//create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		//create a Gradebook object and assign it to myGradebook
		Gradebook myGradebook = new Gradebook();
		
		//prompt for an input course name
		System.out.println("Please enter the course name:");
		String nameOfCourse = input.nextLine();
		System.out.println();
		
		/**call myGradebook's displayMessage method and pass nameOfCourse as an argument*/
		
		myGradebook.displayMessage(nameOfCourse);
	}//end main
}//end class GradebookTest
