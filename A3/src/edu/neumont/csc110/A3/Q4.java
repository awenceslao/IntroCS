package edu.neumont.csc110.A3;

/*
 * Q4 Use a method to remove the duplicate code. 
 * 
 */
public class Q4 {
	
	public static void addressBook(String name, String address, boolean likeFruit, String fruit){
		System.out.print("Hi. My name is " + name + ". ");
	
		
		if(likeFruit == true){
			System.out.println("I like " + fruit + ".");
		}
		else{
			System.out.println("I don't like " + fruit + ".");
		}
	}

	public static void main(String[] args) {
		addressBook("Luke", "321 fake view", true, "bananas");
		
		/*System.out.println("Hi.  My name is Bob.  I live at 123 Main street.");
		System.out.println("Hi.  My name is Alice.  I live at 8a Sinclair street.  I like peaches.");
		System.out.println("Hi.  My name is Jared.  I live at 8802 Exxon street.");
		System.out.println("Hi.  My name is Bob.  I live at 123-5 Dillards street.  I like plums.");
		System.out.println("Hi.  My name is Averie.  I live at 8912 Fox street.");
		*/
		
	}

}
