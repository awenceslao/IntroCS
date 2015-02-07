package edu.neumont.csc110.A3;

/*
 * Q5 Use a method to remove the duplicate code. 
 * 
 */
public class Q5 {
	
	public static void addressBook(String name, String address, boolean likeFruit, String fruit){
		System.out.print("Hi. My name is " + name + ". ");
		
		
		if(likeFruit == true){
			System.out.println("I like " + fruit + ".");
		}
		else{
			System.out.println(" ");
		}
	}
	

	public static void main(String[] args) {
		//same as q3 and a4 but with the last parameter, the user must manually enter multiple fruits
		addressBook("James", "Fakerr dnab ave", true, "apples and bananas");
		
	/*	System.out.println("Hi.  My name is Bob.  I live at 123 Main street.  I like apples.");
		System.out.println("Hi.  My name is Alice.  I live at 8a Sinclair street.  I like peaches and pears and plums and apples.");
		System.out.println("Hi.  My name is Jared.  I live at 8802 Exxon street.");
		System.out.println("Hi.  My name is Bob.  I live at 123-5 Dillards street.  I like plums.");
		System.out.println("Hi.  My name is Averie.  I live at 8912 Fox street.");
		*/
	}
	
}
