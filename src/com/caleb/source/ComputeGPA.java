package com.caleb.source;
/* ComputeGPA.java
* Caleb Hubbard
*/

import java.text.DecimalFormat;
import java.util.Scanner;  


public class ComputeGPA {
	
	public static void main(String[] args) {
		// Creating/Initializing Variables
		int numClass;
		int sum = 0;
		double gpa;
		
		// Opens the Scanner
		Scanner input = new Scanner(System.in);
		
		// Asks how many classes you have
		System.out.println("How many classes do you have? ");
		numClass = input.nextInt();
		
		// Creates an array of Strings that is the size of how many classes you have
		String[] grade = new String[numClass];
		
		// Asks your grade for each class, then puts what you put in through convertGrade();
		for (int i = 0; i < numClass; i++) {
			System.out.println("What is your grade in period " + (i + 1) + "?");
			grade[i] = input.next();
			sum += convertGrade(grade[i]);
		}
		
		// Calculates your GPA by taking the total number, and dividing it by the number of classes
		gpa = (double) sum / (double) numClass;
		
		// Causes the inputed String to output itself to 2 decimal points
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		// Prints your GPA both as a whole number, and as a floating point number
		System.out.println("Your GPA is " + sum / numClass + " or more accurately " + numberFormat.format(gpa));
		
		// Closes the Scanner
		input.close();
		
	}
	
	// Called for each class
	// Returns a value from 4 to 0, depending on if the input is from A to F (e, as well as other letters
	// will return 0
	public static int convertGrade(String grade)
	{
		// Using .toLowerCase() allows the user to input in both capital and lower case
		switch (grade.toLowerCase()) {
			case "a":
				return 4;
				
			case "b":
				return 3;
	    
			case "c":
				return 2;
				
			case "d":
				return 1;
			
			case "f":
				return 0;
		}
		return 0;
	}
}