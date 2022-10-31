package main.learn;
import java.util.Scanner; // Imports Scanner class for input

public class KilometerConversion { // Class Block
	public static void main(String[] args) { // Main Method/ Method Block
		Scanner inp = new Scanner(System.in); // Creates an object of the Scanner class
		
		double km, m; // Declares the variables using double data type
		
		System.out.print("Enter meters: "); // Displays the input prompt and uses 'print' instead of println to display the input on the same line
		m = inp.nextDouble(); // Initializes and assigns the input to the variable
		
		km = m/1000; // Calculation Formula
		
		System.out.println(m+" meters is: "+km+" kilometers"); // Displays the output/ calculation results
		
		inp.close(); // Ends the input
	}
}
