import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Subtraction {
	static Random r = new Random();
	static Scanner input = new Scanner(System.in);
	static boolean reviewingQuestions = true;
	static boolean choosingMath = true;
	static ArrayList<String> testScores = new ArrayList<String>();
	
	public static void chooseMath() {
		do {
			System.out
					.println("Select the difficulty level or 4. to review your scores ");
			System.out.println("1. Easy  2.Medium  3.Hard  0.Exit");
			int difficulty = input.nextInt();
			switch (difficulty) {
			case 0:
				choosingMath = false;
				break;
			case 1:
				easySubtraction();
				break;
			case 2:
				mediumSubtraction();
				break;
			case 3:
				hardSubtraction();
				break;
			case 4:
				for (String scores : testScores) {
					System.out.println(scores);
				}
				break;
			default:
				System.out.println("Only choose 1.Easy  2.Medium or  3.Hard");
				difficulty = input.nextInt();
			}
		} while (choosingMath);
	}

	// //////////////////////////////////////////////////
	// /////////////////////////////////////////////////
	// ////////////////////////////////////////////////

	public static void easySubtraction() {
		int score = 0;
		double percent = 0;

		do {
			System.out.println("How many questions do you want to answer? ");
			int numOfQuestions = input.nextInt();
			if (numOfQuestions <= 0 || numOfQuestions > 20) {		//validation
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextInt();
			}

			String wrongAnswers[] = new String[numOfQuestions];
			int incrementWrong = 0;

			for (int i = 0; i < numOfQuestions; i++) {
				int[] randomNum = { (int)((Math.random() * 5) +1),(int)((Math.random() * 5) +1),(int)((Math.random() * 5) +1),(int)((Math.random() * 5) +1)  };
				Arrays.sort(randomNum);
			
				String question = ("What is " + randomNum[3] + "-" + randomNum[2] + "-" + randomNum[1] + "-" + randomNum[0] + "?");
				
				System.out.println(question);
				int answer = input.nextInt();
				int difference = randomNum[3] - randomNum[2] - randomNum[1] - randomNum[0]; 
				System.out.println("The answer is: " + difference);
				if (answer == difference) {
					score++;
				}
				if (answer != difference) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + difference);
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

	public static void mediumSubtraction() {
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
				int[] randomNum = { (int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100)  };
				Arrays.sort(randomNum);
				
				String question = ("What is " + randomNum[2] + "-" +  randomNum[1] + "-" + randomNum[0] + "?");

				System.out.println(question);
				int answer = input.nextInt();
				int difference = randomNum[2] - randomNum[1] - randomNum[0];
				System.out.println("The answer is: " + difference);
				if (answer == difference) {
					score++;
				}
				if (answer != difference) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + difference);
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

	public static void hardSubtraction() {
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
				
				String question = ("What is " + "(" + nf.format(randomNum[0]) + ")" + "-" + "(" + nf.format(randomNum[1]) + ")" + "?");
				
				System.out.println(question);
				double answer = input.nextDouble();
				double difference = randomNum[0] - randomNum[1];
				difference = Math.round(difference * 100000.00)/100000.00;
				System.out.println("The answer is: " + difference);
				if (answer == difference) {
					score++;
				}
				if (answer != difference) {
					wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + difference);
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

}
