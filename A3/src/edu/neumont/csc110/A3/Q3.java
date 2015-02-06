package edu.neumont.csc110.A3;

/*
 * Q3 Use a method to remove the duplicate code. 
 * 
 */
public class Q3 {
	
	//My Code
	public static void addressBook(String name, String address, String fruit, boolean likeFruit){
		System.out.print("Hi.  My name is " + name + "." + "  I live at " + address + ". ");
		
		if(likeFruit == true){
			System.out.println("I like " + fruit + ".");
		}
		else{
			System.out.println("I don't like " + fruit + ".");
		}
	}
	
	
	

	public static void main(String[] args) {
		//Testing method
		addressBook("Steve", "123 abc ave", "oranges", false);
		
/*		System.out.println("Hi.  My name is Bob.  I live at 123 Main street.  I like apples.");
		System.out.println("Hi.  My name is Alice.  I live at 8a Sinclair street.  I like peaches.");
		System.out.println("Hi.  My name is Jared.  I live at 8802 Exxon street.  I like pears.");
		System.out.println("Hi.  My name is Bob.  I live at 123-5 Dillards street.  I like plums.");
		System.out.println("Hi.  My name is Averie.  I live at 8912 Fox street.  I like apples.");
				*/
	}
}
