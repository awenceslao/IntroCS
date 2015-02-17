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
	
	//using math.random to generate random number with 5 decimal points between -1000 and 1000
	//(Math.random() * 2000) -1000) ---> random double between -1000 and 1000
	//Math.round(....) * 1x.00)/1x.00 ----> rounds number and multiplies & divides it to give certain decimal points
	public static void bae(){
		//double random = Math.round(( (Math.random() * 2000) -1000)*1000.00)/1000.00;
		double random = (int)( (Math.random() * 100) +1 );
		System.out.println(random);
	}
	
	public static void main(String[] args){
		//run();
		add.hardAddition();
		//bae();
		
	}
}















