import java.util.Scanner;

public class mathProgram {
	static Scanner input = new Scanner(System.in);
	static Addition add = new Addition();
	static Subtraction sub = new Subtraction();
	static Multiplication mult = new Multiplication();
	static Division div = new Division();
	
	
	
	public static void startProgram(){
		System.out.println("MATH BUDDY v1.0");
		System.out.println("What kind of math are we doing today?");
		System.out.println("1.Addition  2. Subtraction  3.Multiplication  4.Division");
		int mathing = input.nextInt();
			switch(mathing){
			case 1: 	
				add.chooseMath();
				break;
			case 2:
				sub.chooseMath();
				break;
			case 3:
				mult.chooseMath();
				break;
			case 4:
				div.chooseMath();
				break;
			default:
				System.out.println();
			}
		
		
		
	}
	
	public static void main(String[] args){
		//run();
		mult.chooseMath();
		
		
		
	}
}















