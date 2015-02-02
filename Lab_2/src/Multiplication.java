import java.util.Random;
import java.util.Scanner;

public class Multiplication {
	Random r = new Random();
	Scanner input = new Scanner(System.in);


	public void easyMultiplication(){
		int score = 0;
		double percent = 0;
		System.out.println("How many questions do you want to answer? ");
		int numOfQuestions = input.nextInt();
			if(numOfQuestions <= 0 || numOfQuestions > 20){
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextInt();
			}
			
		for(int i = 0; i < numOfQuestions; i++){
			int randomNum1 = r.nextInt(5)+1;
			int randomNum2 = r.nextInt(5)+1;
			System.out.println("What is " + randomNum1 + "*" + randomNum2 + "?");//PROBLEM: same random numbers being repeated
			int answer = input.nextInt();
			int product = randomNum1 * randomNum2;
			System.out.println("The answer is: " + product);
			if(answer == product){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");			 
	}
	
	public void mediumMultiplication(){
		int score = 0;
		double percent = 0;
		System.out.println("How many questions do you want to answer? ");
		int numOfQuestions = input.nextInt();
			if(numOfQuestions <= 0 || numOfQuestions > 20){
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextInt();
			}

		for(int i = 0; i < numOfQuestions; i++){
			int randomNum1 = r.nextInt(100)+1;
			int randomNum2 = r.nextInt(100)+1;
			System.out.println("What is " + randomNum1 + "*" + randomNum2 + "?");
			int answer = input.nextInt();
			int product = randomNum1 * randomNum2;
			System.out.println("The answer is: " + product);
			if(answer == product){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");
	}
		
	public void hardMultiplication(){
		double score = 0;
		double percent = 0;
		System.out.println("How many questions do you want to answer? ");
		double numOfQuestions = input.nextDouble();
			if(numOfQuestions <= 0 || numOfQuestions > 20){
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextDouble();
			}

		for(int i = 0; i < numOfQuestions; i++){
			double randomNum1 = r.nextInt(100)+1;
			double randomNum2 = r.nextInt(100)+1;
			System.out.println("What is " + "(" + randomNum1 + ")" + "*" + "(" + randomNum2 + ")" + "?");
			double answer = input.nextDouble();
			double product = randomNum1 * randomNum2;
			System.out.println("The answer is: " + product);
			if(answer == product){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");
	}
		
		
		
		
}
