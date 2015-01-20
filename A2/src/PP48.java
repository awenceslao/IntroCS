import java.util.Scanner;
import java.util.Random;

public class PP48 {
	static PP48 runn = new PP48();
	static Scanner scanLee = new Scanner(System.in);
	
	public void pp48(){
		boolean playing = true;
		Random randy = new Random();
		int actualAnswer = randy.nextInt(100)+1;
		
	do{
		System.out.println("I'm thinking of a number between 1 and 100.");
		int userAnswer = scanLee.nextInt();
		
		if(userAnswer > actualAnswer){
			System.out.println("That number is too high");
		}
		if(userAnswer < actualAnswer){
			System.out.println("That number is too low");
		}
		if(userAnswer == actualAnswer){
			System.out.println("That is exactly correct");
			System.out.println("Play again? 1. yes 2. no");
			int replay = scanLee.nextInt();
				switch(replay){
				case 1:
					playing = true;
					break;
				case 2:
					playing = false;
					break;
				default:
					System.out.println("That is not a valid answer");
					System.out.println("Try again, 1. yes 2. no");
					replay = scanLee.nextInt();
				}
			
		}
	}while(playing);
	}
	
	
	public static void main(String[] args) {
		runn.pp48();

	}

}
