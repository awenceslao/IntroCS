import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
	

public class Addition {
	static Scanner input = new Scanner(System.in);
	static boolean choosingMath = true;
	static boolean reviewingQuestions = true;
	static ArrayList<String> additionScores = new ArrayList<String>();
	static ArrayList<String> reviewWrongQuestions = new ArrayList<String>();
	static Random r;
	public static int score = 0;
	public static double percent = 0;
	public static int numOfQuestions;
	
	
	//******************FUNCTIONING******************************\\
					//add the spec about returning average score from multiple iterations
	public void chooseMath() {
		do{
			System.out.println("Select the difficulty level or press 4 to check quiz scores ");
			System.out.println("1. Easy  2.Medium  3.Hard  0.Exit");
			int difficulty = input.nextInt();
			switch (difficulty) {
			case 0:
				choosingMath = false;
				break;
			case 1:
				easy();
				break;
			case 2:
				medium();
				break;
			case 3:
				hard();
				break;
			case 4:
				for (String scores : additionScores) {
					System.out.println(scores);
				}
				break;
			default:
				System.out.println("Only choose 1.Easy  2.Medium or  3.Hard");
				difficulty = input.nextInt();
		}
		}while(choosingMath);

	}

	public static int Beta(int numsPerLine, int range, int zeroModifier) {
		r = new Random();
		int ans = 0;
		int[] alpha = new int[numsPerLine];
		String output = "What is ";		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = r.nextInt(range) + zeroModifier;
			output += alpha[i] + " + ";
			ans += alpha[i];
		}
		output = output.substring(0, output.length() - 3);
		output += " ?";
		System.out.println(output);
		int answer = input.nextInt();
		if(answer == ans){
			score++;
		}
		else {
			reviewWrongQuestions.add(output + " Your answer: " + answer + " Answer: " + ans);
		}
		System.out.println("The answer is " + ans);
		return score;
	}

	//**********************************************************************\\
	
	//need to multiply score and num of questions of each iteration and return a string similar to finalScore
	public static void easy() {
		do {
			System.out.println("How many questions do you want to answer? ");
			int numOfQuestions = input.nextInt();
			if (numOfQuestions <= 0 || numOfQuestions > 20) {
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextInt();
			}
			for (int i = 0; i < numOfQuestions; i++) {
				Beta(4, 5, 1);
			}
			String finalScore = "Final score: " + score + "/" + numOfQuestions + " " +  Math.round((( (double)score/(double)numOfQuestions)*100)) + "%"  ;
			System.out.println(finalScore);
			System.out.println("Review of Questions Answered wrong: ");
			for (String each : reviewWrongQuestions) {
				System.out.println(each);
			}
			System.out.println("1. Review Answer 2. return to menu");
			int refactor = input.nextInt();
			switch (refactor) {
			case 1:
				for (String each : reviewWrongQuestions) {
					System.out.println(each);
				}
				reviewingQuestions = false;
				break;
			case 2:
				reviewWrongQuestions.clear();
				additionScores.add("Score: ");
				reviewingQuestions = false;
				break;
			case 3:
				break;
			default:
				System.out.println("Type 1.yes  or  2.no  only");
				refactor = input.nextInt();
			}
		} while (reviewingQuestions);
	}
	
/*	public static void easy() {
		int score = 0;
		double percent = 0;

		do {
			System.out.println("How many questions do you want to answer? ");
			int numOfQuestions = input.nextInt();
			if (numOfQuestions <= 0 || numOfQuestions > 20) {
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextInt();
			}

			String wrongAnswers[] = new String[numOfQuestions];
			int incrementWrong = 0;

			for (int i = 0; i < numOfQuestions; i++) {
				int[] randomNum = {(int)((Math.random() * 5) +1), (int)((Math.random() * 5) +1), (int)((Math.random() * 5) +1), (int)((Math.random() * 5) +1) };

				String question = ("What is " + randomNum[0] + "+" + randomNum[1] + "+" + randomNum[2] + "+" + randomNum[3] +  "?");
				
				System.out.println(question);
				int answer = input.nextInt();
				int sum = randomNum[0] + randomNum[1] + randomNum[2] + randomNum[3];
				System.out.println("The answer is: " + sum);
				if (answer == sum) {
					score++;
				}
				if (answer != sum) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + sum);
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
				System.out.println("Type 1.yes  or  2.no  only");
				refactor = input.nextInt();
			}

		} while (reviewingQuestions);

	}*/
	
	public static void medium() {
		int score = 0;
		double percent = 0;
		do {
			System.out.println("How many questions do you want to answer? ");
			int numOfQuestions = input.nextInt();
			if (numOfQuestions <= 0 || numOfQuestions > 20) {
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextInt();
			}

			String wrongAnswers[] = new String[numOfQuestions];
			int incrementWrong = 0;

			for (int i = 0; i < numOfQuestions; i++) {
				int[] randomNum = {(int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100)};
				
				String question = ("What is " + randomNum[0] + "+" + randomNum[1] + "+" + randomNum[2] + "?");
				
				System.out.println(question);
				int answer = input.nextInt();
				int sum = randomNum[0] + randomNum[1] + randomNum[2];
				System.out.println("The answer is: " + sum);
				if (answer == sum) {
					score++;
				}
				if (answer != sum) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + sum);
					incrementWrong++;
				}
			}
			percent = ((double) score / (double) numOfQuestions) * 100;
			String finale = ("Score: " + score + "/" + numOfQuestions + " " + Math.round(percent) + "%");
			additionScores.add(finale);
			
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
				System.out.println("Type 1.yes  or  2.no  only");
				refactor = input.nextInt();
			}

		} while (reviewingQuestions);
	}
	
	public static void hard() {
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
				double[] randomNum = { ((Math.random() * 2000)- 1000) , ((Math.random() * 2000)- 1000) };
				String question = ("What is " + "(" + nf.format(randomNum[0]) + ")" + " + " + "(" + nf.format(randomNum[1]) + ")" + "?");
				
				System.out.println(question);
				double answer = input.nextDouble();
				double sum = randomNum[0] + randomNum[1];
				sum = Math.round(sum * 100000.00)/100000.00;
				System.out.println("The answer is: " + sum);
				if (answer == sum) {
					score++;
				}
				if (answer != sum) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + sum);
					incrementWrong++;
				}
			}
			percent = ((double) score / (double) numOfQuestions) * 100;
			String finale = ("Score: " + score + "/" + numOfQuestions + " " + Math.round(percent) + "%");
			additionScores.add(finale);
			
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
	
}
