import java.util.Random;
import java.util.Scanner;

public class Division {
	Random r = new Random();
	Scanner input = new Scanner(System.in);


	public void easyDivision(){
		int score = 0;
		double percent = 0;
		
		System.out.println("How many questions do you want to answer? ");
		double numOfQuestions = input.nextInt();
		if(numOfQuestions <= 0 || numOfQuestions > 20){
			System.out.println("That number of questions isn't allowed");
			System.out.println("How many questions do you want to answer? ");
			numOfQuestions = input.nextDouble();
		}
		r.setSeed(17);
		for(int i = 0; i < numOfQuestions; i++){
			int randomNum1 = r.nextInt(5)+1;
			int randomNum2 = r.nextInt(5)+1;
			System.out.println("What is " + (Math.max(randomNum1, randomNum2)) + "/" + (Math.min(randomNum1, randomNum2)) + "?");
			double answer = input.nextDouble();
			double quotient = Math.max((double)randomNum1, (double)randomNum2) / (Math.min((double)randomNum1, (double)randomNum2));
			System.out.println("The answer is: " + Math.round(quotient *100.00)/100.00);
			if(answer == quotient){
				score++;
			}
		}
		percent = ((double)score / (double)numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");
		
	//////////////////////
	//	num % 2==0 -> get even/odd number
		//print out random number, never get odd?
		//////////////////////
			 
			 
			 
	}
	
	public void mediumDivision(){
		double score = 0;
		double percent = 0;
		
		System.out.println("How many questions do you want to answer? ");
		double numOfQuestions = input.nextDouble();
		if(numOfQuestions <= 0 || numOfQuestions > 20){         
			System.out.println("That number of questions isn't allowed");
			System.out.println("How many questions do you want to answer? ");
			numOfQuestions = input.nextDouble();
		}       
		
		r.setSeed(17);
		
		for(int i = 0; i < numOfQuestions; i++){          //
			double randomNum1 = r.nextInt(100)+1;
			double randomNum2 = r.nextInt(100)+1;
			
			System.out.println("What is " + (Math.max(randomNum1, randomNum2)) + "/" + (Math.min(randomNum1, randomNum2)) + "?");
			double answer = input.nextDouble();
			double quotient = Math.max(randomNum1, randomNum2) / (Math.min(randomNum1, randomNum2));
			
			System.out.println("The answer is: " + Math.round(quotient *100.00) / 100.00);
			if(answer == quotient){
				score++;
			}
		}
		percent = (score / numOfQuestions)*100;
		
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");			 
	
}
	
	public void hardDivision(){
		double score = 0;
		double percent = 0;
		double answer;
		double quotient;
		
		System.out.println("How many questions do you want to answer? ");
		double numOfQuestions = input.nextDouble();
		if(numOfQuestions <= 0 || numOfQuestions > 20){
			System.out.println("That number of questions isn't allowed");
			System.out.println("How many questions do you want to answer? ");
			numOfQuestions = input.nextDouble();
		}
		
	//	r.setSeed(17);
		
		for(int i = 0; i < numOfQuestions; i++){
			double randomNum1 = r.nextInt(2000)-1000;
			double randomNum2 = r.nextInt(2000)-1000;
			
			///math.abs
			System.out.println("What is " + "(" + (Math.max(Math.abs(randomNum1), Math.abs(randomNum2))) + ")" +  "/" + "(" + (Math.min(Math.abs(randomNum1), Math.abs(randomNum2))) + ")" +  "?");
			answer = input.nextDouble();
			quotient = Math.min(randomNum1, randomNum2) / (Math.max(randomNum1, randomNum2));
			System.out.println("The answer is: " + Math.round(quotient *100000.00)/100000.00);
			if(answer == quotient){
				score++;
			}
		}
		percent = (score / numOfQuestions)*100;
		System.out.println("Final score: " + score + " out of " + numOfQuestions);
		System.out.println(Math.round(percent) +"%");	

			 
	}

		
}

