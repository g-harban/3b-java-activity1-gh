package main.learn;
import java.util.Scanner; // Imports the Scanner class for input

public class AreaTriangle { // Class Block
	
	public static void main(String[] args) { //Main Method/ Method Block
		Scanner inp = new Scanner(System.in); // Creates an object of the Scanner class
		
		double b, h; // Declares the base and height variables 
		
		System.out.print("Enter the base(m^2): "); // Displays the input prompt and uses 'print' instead of println to display the input on the same line
		b = inp.nextDouble();// Initializes and assigns the input to a variable
		
		System.out.print("\nEnter the height(m^2): "); // Repeats the process above but uses '\n' to separate the prompts
		h = inp.nextDouble();
		
		double area = (b*h)/2; // Calculation Formula
		
		System.out.println("The area is: "+area+" m^2"); // Displays the output/ Calculation Results
		
		
		inp.close(); // Ends the input
	}
}
