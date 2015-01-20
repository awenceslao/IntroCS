import java.util.Collections;
import java.util.Scanner;

public class Examples {
	static Examples ex = new Examples();
	static Scanner scanLee = new Scanner(System.in);
	
	
	public void ex48(){
		
		//What output is produced by the following code fragment?
			int num = 1, max = 20;
			
			System.out.println("The output is all even numbers between 1 and 20");
			
			while(num < max){
				
				if(num % 2 == 0)
					System.out.println(num);
					num++;
				
			}

	}
	
	public void ex411(){
		//Transform the following while loop into an equivalent do loop
		//Make sure it produces the same output
		
		int num = 1;
		//While loop
		//Prints out numbers 2 - 20
		
		/*
		 
		 while(num < 20){
			num++;
			System.out.println(num);
			}
			
		*/
		
		//do while
		do{
			num++;
			System.out.println(num);
			
		}while(num < 20);
		
		
		
		
		
	}
	
	public void ex412(){
		//Transform the while loop from ex4.11 into a for loop
		
		for(int num = 1; num < 21; num++){
			System.out.println(num);
		}
		
		
	}
	
	public void ex414(){
		//write a while loop that verifies that the user enters a positive integer value
		System.out.println("enter a number");
		int num = scanLee.nextInt();
				
		while(num < 0){
			System.out.println("That number is not positive");
			System.out.println("enter a number");
			num = scanLee.nextInt();
		}
		while(num > 0){
			System.out.println("That number is positive");
			System.out.println("enter a number");
			num = scanLee.nextInt();
		}
		
		
	}
	
	public void ex417(){
		//write a for loop to print the odd numbers between 1 and 99(inclusive)
		
		for(int num = 0; num < 100; num++){
			if(num % 2 != 0){
				System.out.println(num);
			}
		}
	}
	
	
	//unfinished, couldn't figure out how to find max value
	public void ex419(){
		//write a code fragment that reads 10 ints from the user and prints the highest value
		int[] nums = new int[10];
		
		System.out.println("enter 10 numbers");
		nums[0] = scanLee.nextInt();
		nums[1] = scanLee.nextInt();
		nums[2] = scanLee.nextInt();
		nums[3] = scanLee.nextInt();
		nums[4] = scanLee.nextInt();
		nums[5] = scanLee.nextInt();
		nums[6] = scanLee.nextInt();
		nums[7] = scanLee.nextInt();
		nums[8] = scanLee.nextInt();
		nums[9] = scanLee.nextInt();
		

	}
	
	public static void main(String[] args){
		ex.ex419();
		
	}
	
}
