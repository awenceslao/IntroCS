import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class validName {
	static Scanner input = new Scanner(System.in);
	static boolean choosingMath = true;
	static boolean reviewingQuestions = true;
	static ArrayList<String> testScores = new ArrayList<String>();
	static ArrayList<String> reviewWrongQuestions = new ArrayList<String>();
	static Random r;
	public static int score = 0;
	public static double percent = 0;
	public int numOfQuestions;
	
	

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
			System.out.println("Final score: " + score + "/" + numOfQuestions + " " +  Math.round((( (double)score/(double)numOfQuestions)*100)) + "%" );
			System.out.println("Review of Questions Answered wrong: ");
			for (String each : reviewWrongQuestions) {
				System.out.println(each);
			}
			System.out.println("Review answers?  1.yes or 2. no ");
			int refactor = input.nextInt();
			switch (refactor) {
			case 1:
				for (String each : reviewWrongQuestions) {
					System.out.println(each);
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
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//Previous Code\\
	
	//Addition
	
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
	
/*	public static void medium() {
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
	}*/
	
/*	public static void hard() {
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

}*/
	
	//Multiplication\\
	
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
			int[] randomNum = { (int) ((Math.random() * 5) + 1), (int) ((Math.random() * 5) + 1), (int) ((Math.random() * 5) + 1), (int) ((Math.random() * 5) + 1) };

			String question = ("What is " + randomNum[0] + "*" + randomNum[1] + "*" + randomNum[2] + "*" + randomNum[3] + "?");

			System.out.println(question);
			int answer = input.nextInt();
			int product = randomNum[0] * randomNum[1] * randomNum[2] * randomNum[3];
			System.out.println("The answer is: " + product);
			if (answer == product) {
				score++;
			}
			if (answer != product) {
				wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + product);
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
*/
	
/*	public static void medium() {
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
			int[] randomNum = { (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100) };
			String question = ("What is " + randomNum[0] + "*" + randomNum[1] + "*" + randomNum[2] + "?");

			System.out.println(question);
			int answer = input.nextInt();
			int product = randomNum[0] * randomNum[1] * randomNum[2];
			System.out.println("The answer is: " + product);
			if (answer == product) {
				score++;
			}
			if (answer != product) {
				wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + product);
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
*/
	
/*	public static void hard() {
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
			double[] randomNum = { ((Math.random() * 2000) - 1000), ((Math.random() * 2000) - 1000) };
			String question = ("What is " + "(" + nf.format(randomNum[0]) + ")" + " * " + "(" + nf.format(randomNum[1]) + ")" + "?");

			System.out.println(question);
			double answer = input.nextDouble();
			double product = randomNum[0] * randomNum[1];
			product = Math.round(product * 100000.00) / 100000.00;

			System.out.println("The answer is: " + product);
			if (answer == product) {
				score++;
			}
			if (answer != product) {
				wrongAnswers[incrementWrong] = (question + " You answered: " + answer + " The correct answer is: " + product);
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
}*/

	
	
	public static void main(String[] args) {
	}
}
