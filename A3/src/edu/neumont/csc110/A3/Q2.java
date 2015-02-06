package edu.neumont.csc110.A3;

/*
 * Q2: 	You can answer this one in main entirely.
 * 
 * 		Consolidate the logic (using else if and nesting) to minimize the number of times m's value is checked.
 * 		Add any missing enum members to the case statement.  Use ctrl-space on the case to see the IDE help you 
 * 		see what's missing.  Try using the IDE's design time (hover) help as well.  Do you get that with an if statement?
 * 		Remove the System.exit(0), replace it with logic.
 * 		What 
 * 
 * 		Gold star for removing the case statement all together _and_ retaining the capitalization shown in the output.
 */

public class Q2 {

	public static void main(String[] args) {
		
		Manufacturer m;
		m = Manufacturer.FERRARI; // simulated user input

		
		switch(m) {
		case CHEVROLET:
			System.out.println("My make is Chevrolet.");
			System.out.println("You'll pay a lot less than a premium sports car.");
			System.out.println("My homeland is the USA");
			break;		
		case FORD:
			System.out.println("My make is Ford.");
			System.out.println("You'll pay a lot less than a premium sports car.");
			System.out.println("My homeland is the USA");
			break;
		case PORSCHE:
			System.out.println("My make is Porsche.");
			System.out.println("You'll pay a lot");
			System.out.println("My homeland is Germany");
			break;
		case FIAT:
			System.out.println("My make is Fiat");
			System.out.println("You'll pay a lot less than a premium sports car.");
			System.out.println("My homeland is Italy");
			System.out.println("And I am the parent company of Ferrari.");
			break;
		case FERRARI:
			System.out.println("My make is Ferrari");
			System.out.println("You'll pay a lot");
			System.out.println("My homeland is Italy");
			break;
			
		}

		////////////////////
		//don't have to use if statements


	}

}
