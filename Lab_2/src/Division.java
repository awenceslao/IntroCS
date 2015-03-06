import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
					double[] randomNum = {   (int)((Math.random() * 5) +1), (int)((Math.random() * 5) +1)    };
					Arrays.sort(randomNum);
					
					String question = ("What is " + randomNum[1] + "/" + randomNum[0] + "?");
					
					System.out.println(question);
					double answer = input.nextDouble();
					double quotient = randomNum[1] / randomNum[0];
					quotient = Math.round(quotient * 100.00)/100.00;
					System.out.println("The answer is: " + quotient);
					
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
				double[] randomNum = {   (int)(Math.random() * 100), (int)(Math.random() * 100)    };
				Arrays.sort(randomNum);
				
				String question = ("What is " + randomNum[1] + "/" + randomNum[0] + "?");
				
				System.out.println(question);
				double answer = input.nextDouble();
				double quotient = randomNum[1] / randomNum[0];
				quotient = Math.round(quotient * 100.00)/100.00;
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
			
			for (int i = 0; i < numOfQuestions; i++) {
				DecimalFormat nf = new DecimalFormat("##.#####");
				double[] randomNum = { ((Math.random() * 2000) -1000), ((Math.random() * 2000) -1000) };
				
				String question = ("What is " + "(" + nf.format(randomNum[0]) + ")" + "/" + "(" + nf.format(randomNum[1]) + ")" + "?");
				
				System.out.println(question);
				double answer = input.nextDouble();
				double quotient =  randomNum[1] / randomNum[0];				
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
