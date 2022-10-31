package main.learn;
import java.util.Scanner; // Imports the scanner class for input

public class SumProgram { // Class Block

	public static void main(String[] args) {// Main Method / Method Block
		
		Scanner inp = new Scanner(System.in); // Creates an object of the Scanner Class
		
		double num1, num2, num3, num4, num5, sum; // Declares all variables using the double data type
		
		System.out.print("Enter the first number: "); // Displays the input prompt and uses 'print' instead of println to display the input on the same line
		num1 = inp.nextDouble(); // Initializes and assigns the input to a variable
		System.out.print("\nEnter the second number: "); // Repeats the process above but uses '\n' to separate the prompts
		num2 = inp.nextDouble();
		System.out.print("\nEnter the third number: ");
		num3 = inp.nextDouble();
		System.out.print("\nEnter the fourth number: ");
		num4 = inp.nextDouble();
		System.out.print("\nEnter the fifth number: ");
		num5 = inp.nextDouble();

		sum = num1+num2+num3+num4+num5; // Calculation
		System.out.println("The sum is "+sum); // Displays the output/ calculation results
		
		inp.close(); // ends the input
	}

}
