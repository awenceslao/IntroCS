package edu.neumont.csc110.A3;


//Q1: Create a method to removes the duplicate code.  And the logical error. ;)
public class Q1 {
	
	//My Code
	public static void compare(int i, int j){
		if(i < j){
			System.out.println("Variable i(" + i + ") is less than variable j(" + j +")");
		}
		else{
			System.out.println("Variable i(" + i + ") is greater than variable j(" + j +")");
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		//My code
		compare(15, 7);
		
		
/*		
		int i, j;
		i = 15; //simulated user input
		j = 7;  //simulated user input
		
		if (i < j) {
			System.out.println("The first variable is smaller than the second: i (" + i + ") is smaller than j (" + j + ")");
		} else {
			System.out.println("The first variable is larger than the second: i (" + i + ") is less than j (" + j + ")");
		}
		
		i = 1; //simulating more user input
		j = 1000000;  //simulating more user input
		
		if (i < j) {
			System.out.println("The first variable is smaller than the second: i (" + i + ") is smaller than j (" + j + ")");
		} else {
			System.out.println("The first variable is larger than the second: i (" + i + ") is less than j (" + j + ")");
		}
			
		*/

	}

}
