package main.learn;
import java.util.Scanner; // Imports the Scanner class for input

public class AreaRectangle { // Class Block

	public static void main(String[] args) {// Main Method/Method Block
		Scanner inp = new Scanner(System.in); //Creates an Object of the Scanner class 
		double l, w; // Declares the width, and height variables using the double data type
		
		System.out.print("Enter the length(m^2): "); // Displays the input prompt and uses 'print' instead of println to display the input on the same line
		l = inp.nextDouble(); // Initializes/ assigns the input to variables
		System.out.print("\nEnter the width(m^2): "); // Repeats the process above but uses '\n' to separate the prompts
		w = inp.nextDouble();
		
		double area = l*w; // Calculation formula
		
		System.out.println("The area is: "+area+" m^2"); //Displays the output/calculation results
		
		inp.close(); // Ends the input
	}

}
