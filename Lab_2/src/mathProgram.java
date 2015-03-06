import java.util.Scanner;

public class mathProgram {
	static Scanner input = new Scanner(System.in);
	static Addition add = new Addition();
	static Subtraction sub = new Subtraction();
	static Multiplication mult = new Multiplication();
	static Division div = new Division();
	
	
	public static void run(){
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
		div.hardDivision();

		/*
		int a = 1;
		int b = 55;
		int c = 200;
		int max = (Math.max(  Math.max(a, b)  , c) );
		int min = (Math.min(  Math.min(a, b)  , c) );
		
			3rd			2nd			  (1st                   1st)                 (1st)                    
		Minimum of( minimum of( (max of 'a' and 'b') & (max of 'b' and 'c') & (max of('a' & 'c'))
		int median = Math.min(  Math.min(Math.max(a,b), Math.max(b,c)),         Math.max(a,c));
		System.out.println("min " + min);
		System.out.println("max " + max);
		System.out.println("median " + median);
		*/
		
		
		
		
	}
}















