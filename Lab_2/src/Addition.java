import java.util.Random;
import java.util.Scanner;

public class Addition {
	Random r = new Random();
	Scanner input = new Scanner(System.in);


	public void easyAddition(){
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
			System.out.println("What is " + randomNum1 + "+" + randomNum2 + "?");//PROBLEM: same random numbers being repeated
			int answer = input.nextInt();
			int sum = randomNum1 + randomNum2;
			System.out.println("The answer is: " + sum);
			if(answer == sum){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");
	}
	
	
	public void mediumAddition(){
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
			System.out.println("What is " + randomNum1 + "+" + randomNum2 + "?");//PROBLEM: same random numbers being repeated
			int answer = input.nextInt();
			int sum = randomNum1 + randomNum2;
			System.out.println("The answer is: " + sum);
			if(answer == sum){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");
	}
	
	
	public void hardAddition(){
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
			System.out.println("What is " + "(" +randomNum1 + ")" + " + " + "(" + randomNum2 + ")" + "?");//PROBLEM: same random numbers being repeated
			double answer = input.nextDouble();
			double sum = randomNum1 + randomNum2;
			System.out.println("The answer is: " + sum);
			if(answer == sum){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
}
