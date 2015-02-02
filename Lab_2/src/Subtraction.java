import java.util.Random;
import java.util.Scanner;

public class Subtraction {
	Random r = new Random();
	Scanner input = new Scanner(System.in);


	public void easySubtraction(){
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
			System.out.println("What is " + (Math.max(randomNum1, randomNum2)) + "-" + (Math.min(randomNum1, randomNum2)) + "?");//PROBLEM: same random numbers being repeated
			int answer = input.nextInt();
			int difference = Math.max(randomNum1, randomNum2) - (Math.min(randomNum1, randomNum2));
			System.out.println("The answer is: " + difference);
			if(answer == difference){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%"); 
	}
	
	public void mediumSubtraction(){
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
			System.out.println("What is " + (Math.max(randomNum1, randomNum2)) + "-" + (Math.min(randomNum1, randomNum2)) + "?");
			int answer = input.nextInt();
			int difference = Math.max(randomNum1, randomNum2) - (Math.min(randomNum1, randomNum2));
			System.out.println("The answer is: " + difference);
			if(answer == difference){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%"); 
	}
	
	
	public void hardSubtraction(){
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
			double randomNum1 = r.nextInt(2000)-1000;
			double randomNum2 = r.nextInt(2000)-1000;
			System.out.println("What is " + "(" + (Math.max(randomNum1, randomNum2)) + ")" + "-" + "(" + (Math.min(randomNum1, randomNum2)) + ")" + "?");//PROBLEM: same random numbers being repeated
			double answer = input.nextDouble();
			double difference = Math.max(randomNum1, randomNum2) - (Math.min(randomNum1, randomNum2));
			System.out.println("The answer is: " + difference);
			if(answer == difference){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%"); 
	}
	
	
	
		
		
		
		
}
