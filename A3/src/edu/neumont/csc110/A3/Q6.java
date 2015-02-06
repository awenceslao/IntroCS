package edu.neumont.csc110.A3;

/*
 * Q5 	Use a method to remove the duplicate code. 
 * 		Your solution should have only one loop.
 * 
 */
public class Q6 {
	
	static int i = 1;
	static int j = 5;
	static int k = 50;
	public static void main(String[] args) {
		for(int l = 1; l <= 28; l++){
			if(l <= 10){
				if(i <= 10){
					System.out.println("Number: " + i);
					i++;
				}
			}
			if(l > 10 && l <= 25){
				if(j < 150){
					System.out.println("Numero: " + j);
					j +=10;
				}
			}
			if(l > 25){
				if(k <= 70){
					System.out.println("Aantal: " + k);
					 k += 10;
				}
			}
			
			
			
		}
		
		
		
	
////////////////////////////////////////////////////////////////////
/*		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Number: " + i);
		}
		System.out.println();
		
		for (int i = 5; i <= 150; i += 10) {
			System.out.println("Numero: " + i);
		}
		System.out.println();
		
		for (int i = 50; i <= 70; i += 10) {
			System.out.println("Aantal: " + i);
		}
		System.out.println();
			*/
	}
			
}
