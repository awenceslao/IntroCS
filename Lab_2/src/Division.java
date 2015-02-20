import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Division {
	static Random r = new Random();
	static Scanner input = new Scanner(System.in);
	static boolean reviewingQuestions = true;
	static boolean choosingMath = true;
	static ArrayList<String> testScores = new ArrayList<String>();

	public void chooseMath() {
		do {
			System.out.println("Select the difficulty level or press 4 to review scores ");
			System.out.println("1. Easy  2.Medium  3.Hard  0.Exit");
			int difficulty = input.nextInt();
			switch (difficulty) {
			case 1:
				easyDivision();
				break;
			case 2:
				mediumDivision();
				break;
			case 3:
				hardDivision();
				break;
			default:
				System.out.println("Only choose 1.Easy  2.Medium or  3.Hard");
				difficulty = input.nextInt();
			}
		} while (choosingMath);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////            TO FIX:
////////////////////////////////////////////---Fix division's math
////////////////////////////////////////////---Make total returned scores return combined total
////////////////////////////////////////////      ex: 3/5 & 1/3 as scores, return as total score: 14/15
////////////////////////////////////////////---refactor
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	public static void easyDivision() {
		int score = 0;
		double percent = 0;

		do {
			System.out.println("How many questions do you want to answer? ");
			double numOfQuestions = input.nextInt();
			if (numOfQuestions <= 0 || numOfQuestions > 20) {
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextDouble();
			}

			String wrongAnswers[] = new String[(int) numOfQuestions];
			int incrementWrong = 0;

			for (int i = 0; i < numOfQuestions; i++) {
				int randomNum1 = (int)((Math.random() * 5) +1);
				int randomNum2 = (int)((Math.random() * 5) +1);
				String question = ("What is " + (Math.max(randomNum1, randomNum2)) + "/" + (Math.min(randomNum1, randomNum2)) + "?");

				System.out.println(question);
				double answer = input.nextDouble();
				double quotient = Math.max((double) randomNum1, (double) randomNum2) / (Math.min((double) randomNum1, (double) randomNum2));
				System.out.println("The answer is: " + Math.round(quotient * 10.00) / 10.00);
				if (answer == quotient) {
					score++;
				}
				if (answer != quotient) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + quotient);
					incrementWrong++;
				}
			}
			percent = ((double) score / (double) numOfQuestions) * 100;
			String finale = ("Score: " + score + "/" + numOfQuestions + " " + Math.round(percent) + "%");
			testScores.add(finale);

			System.out.println("Final score: " + finale);

			System.out.println("Review answers?  1.yes or 2. no ");
			int refactor = input.nextInt();
			switch (refactor) {
			case 1:
				for (String iteration : wrongAnswers) {
					if (iteration != null) {
						System.out.println(iteration);
					}
				}
				reviewingQuestions = false;
				break;
			case 2:
				reviewingQuestions = false;
				break;
			default:
				System.out.println("Type yes or no only");
				refactor = input.nextInt();
			}

		} while (reviewingQuestions);
	}

	public static void mediumDivision() {
		double score = 0;
		double percent = 0;

		do {
			System.out.println("How many questions do you want to answer? ");
			double numOfQuestions = input.nextDouble();
			if (numOfQuestions <= 0 || numOfQuestions > 20) {
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextDouble();
			}

			String wrongAnswers[] = new String[(int) numOfQuestions];
			int incrementWrong = 0;

			for (int i = 0; i < numOfQuestions; i++) { //
				int randomNum1 = (int)(Math.random() * 100);
				int randomNum2 = (int)(Math.random() * 100);
				String question = ("What is " + (Math.max(randomNum1, randomNum2)) + "/" + (Math.min(randomNum1, randomNum2)) + "?");

				System.out.println(question);
				double answer = input.nextDouble();
				double quotient = Math.max(randomNum1, randomNum2) / (Math.min(randomNum1, randomNum2));

				System.out.println("The answer is: " + Math.round(quotient));
				if (answer == quotient) {
					score++;
				}
				if (answer != quotient) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + quotient);
					incrementWrong++;
				}
			}
			percent = (score / numOfQuestions) * 100;
			String finale = ("Score: " + score + "/" + numOfQuestions + " " + Math.round(percent) + "%");
			testScores.add(finale);

			System.out.println("Final score: " + finale);

			System.out.println("Review answers?  1.yes or 2. no ");
			int refactor = input.nextInt();
			switch (refactor) {
			case 1:
				for (String iteration : wrongAnswers) {
					if (iteration != null) {
						System.out.println(iteration);
					}
				}
				reviewingQuestions = false;
				break;
			case 2:
				reviewingQuestions = false;
				break;
			default:
				System.out.println("Type yes or no only");
				refactor = input.nextInt();
			}

		} while (reviewingQuestions);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void hardDivision() {
		double score = 0;
		double percent = 0;

		do {
			System.out.println("How many questions do you want to answer? ");
			double numOfQuestions = input.nextDouble();
			
			if (numOfQuestions <= 0 || numOfQuestions > 20) {
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextDouble();
			}
			
			
			String wrongAnswers[] = new String[(int) numOfQuestions];
			int incrementWrong = 0;
			
			//if statements ?
			//if Math.abs(max of random nums) / Math.abs(min of random nums )
				//multiply by -1 everytime?
			for (int i = 0; i < numOfQuestions; i++) {
				double randomNum1 = Math.round(( (Math.random() * 2000) -1000)*100000.00)/100000.00;
				double randomNum2 = Math.round(( (Math.random() * 2000) -1000)*100000.00)/100000.00;
				////////////////////////////////////////////////////////////////////////////////////
				/*
				 if(randomNum1 < 0){
				String question = ("What is " + "(" + (Math.max(Math.abs(randomNum1), Math.abs(randomNum2)) * (-1) ) + ")" + "/" + "(" + (Math.max(randomNum1, randomNum2)) + ")" + "?");
				 	
				}
				*/
				////////////////////////////////////////////////////////////////////////////////////
				String question = ("What is " + "(" + randomNum1 + ")" + "/" + "(" + randomNum2 + ")" + "?");

				System.out.println(question);
				double answer = input.nextDouble();
				double quotient =  randomNum1 / randomNum2;				//PROBLEM IS HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				quotient = Math.round(quotient * 100000.00)/100000.00;
				System.out.println("The answer is: " + quotient);
				if (answer == quotient) {
					score++;
				}
				if (answer != quotient) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + quotient);
					incrementWrong++;
				}
			}
			percent = (score / numOfQuestions) * 100;
			String finale = ("Score: " + score + "/" + numOfQuestions + " " + Math.round(percent) + "%");
			testScores.add(finale);

			System.out.println("Final score: " + finale);

			System.out.println("Review answers?  1.yes or 2. no ");
			int refactor = input.nextInt();
			switch (refactor) {
			case 1:
				for (String iteration : wrongAnswers) {
					if (iteration != null) {
						System.out.println(iteration);
					}
				}
				reviewingQuestions = false;
				break;
			case 2:
				reviewingQuestions = false;
				break;
			default:
				System.out.println("Type yes or no only");
				refactor = input.nextInt();
			}

		} while (reviewingQuestions);
	}
	
	
	
	
	
	
	// /////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////

}
