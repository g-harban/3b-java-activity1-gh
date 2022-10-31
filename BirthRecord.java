package main.learn;
import java.util.Scanner; // imports the scanner class for input

public class BirthRecord { // Class Block

	public static void main(String[] args) { //Main Method / Method Block
		
		Scanner inp = new Scanner(System.in); // Creates an object of the Scanner class where the reference variable is: 'inp'
		
		String fName, lName, dob; // declares the variables for First Name, Last name, and Date of Birth
		int age; // declares the age variable
		
		System.out.print("Enter your first name: "); // Displays the input prompt and uses 'print' instead of println to display the input on the same line
		fName = inp.nextLine(); // Initializes and assigns the input to the variable
		
		System.out.print("\nEnter your last name: ");// Repeats the process above but uses '\n' to separate the prompts
		lName = inp.nextLine();
		
		System.out.print("\nEnter your date of birth: ");
		dob = inp.nextLine();
		
		System.out.print("\nEnter your age: ");
		age = inp.nextInt();
		
		
		System.out.println("\nFirst name: "+fName); // Displays the output
		System.out.println("Last name: "+lName);
		System.out.println("Age: "+age);
		System.out.println("Date of birth: "+dob);
		
		inp.close(); // ends the input
	}

}
