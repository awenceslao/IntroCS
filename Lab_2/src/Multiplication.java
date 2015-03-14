import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Multiplication {
	static Scanner input = new Scanner(System.in);
	static boolean choosingMath = true;
	static boolean reviewingQuestions = true;
	static ArrayList<String> reviewWrongQuestions = new ArrayList<String>();
	static Random r = new Random();
	public static int score = 0;
	public static double percent = 0;
	public static double numerator = 0;
	public static double denominator = 0;

	public void chooseMath() {
		do {
			System.out.println("Select the difficulty level");
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
			default:
				System.out.println("Only choose 1.Easy  2.Medium or  3.Hard");
				difficulty = input.nextInt();
			}
		} while (choosingMath);
	}

	public static int alpha(int numsPerLine, int range, int zeroModifier) {
		r = new Random();
		int ans = 1;
		int[] alpha = new int[numsPerLine];
		String output = "What is ";
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (int) ((Math.random() * range) + zeroModifier);
			output += alpha[i] + " * ";
			ans *= alpha[i];
		}
		output = output.substring(0, output.length() - 3);
		output += " ?";
		System.out.println(output);
		int answer = input.nextInt();
		if (answer == ans) {
			score++;
		} else {
			reviewWrongQuestions.add(output + " Your answer: " + answer + " Answer: " + ans);
		}
		System.out.println("The answer is " + ans);
		return score;
	}

	/**
	 * For Hard Difficulty only
	 */
	public static double beta() {
		r = new Random();
		double ans = 1;
		double[] alpha = new double[2];
		String output = "What is ";
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = Math.round(((Math.random() * 2000) - 1000) * 10000.00) / 100000.00;
			output += alpha[i] + " * ";
			ans *= alpha[i];
		}
		output = output.substring(0, output.length() - 3);
		output += " ?";
		System.out.println(output);
		double answer = input.nextDouble();
		ans = Math.round(ans * 100000.00) / 100000.00;
		if (answer == ans) {
			score++;
		} else {
			reviewWrongQuestions.add(output + " Your answer: " + answer + " Answer: " + ans);
		}
		System.out.println("The answer is " + ans);
		return score;
	}

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
				alpha(4, 5, 1);
			}
			String finalScore = "\nFinal score: " + score + "/" + numOfQuestions + "  " + Math.round((((double) score / (double) numOfQuestions) * 100)) + "%";
			System.out.println(finalScore);
			numerator += score;
			denominator += numOfQuestions;
			System.out.println("Running Total For Multiplication : " + numerator + "/" + denominator + " " + Math.round(((double) numerator / (double) denominator) * 100) + "%\n");
			System.out.println("Review of Questions Answered wrong: ");
			for (String each : reviewWrongQuestions) {
				System.out.println(each);
			}
			System.out.println("\n1. Return to menu  2. Exit");
			int refactor = input.nextInt();
			switch (refactor) {
			case 1:
				reviewWrongQuestions.clear();
				score = 0;
				numOfQuestions = 0;
				reviewingQuestions = false;
				break;
			case 2:
				reviewingQuestions = false;
				choosingMath = false;
				break;
			default:
				System.out.println("Type 1.yes  or  2.no  only");
				refactor = input.nextInt();
			}
		} while (reviewingQuestions);
	}

	public static void medium() {
		do {
			System.out.println("How many questions do you want to answer? ");
			int numOfQuestions = input.nextInt();
			if (numOfQuestions <= 0 || numOfQuestions > 20) {
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextInt();
			}
			for (int i = 0; i < numOfQuestions; i++) {
				alpha(3, 100, 0);
			}
			String finalScore = "\nFinal score: " + score + "/" + numOfQuestions + "  " + Math.round((((double) score / (double) numOfQuestions) * 100)) + "%";
			System.out.println(finalScore);
			numerator += score;
			denominator += numOfQuestions;
			System.out.println("Running Total For Multiplication : " + numerator + "/" + denominator + " " + Math.round(((double) numerator / (double) denominator) * 100) + "%\n");
			System.out.println("Review of Questions Answered wrong: ");
			for (String each : reviewWrongQuestions) {
				System.out.println(each);
			}
			System.out.println("\n1. Return to menu  2. Exit");
			int refactor = input.nextInt();
			switch (refactor) {
			case 1:
				reviewWrongQuestions.clear();
				score = 0;
				numOfQuestions = 0;
				reviewingQuestions = false;
				break;
			case 2:
				reviewingQuestions = false;
				choosingMath = false;
				break;
			default:
				System.out.println("Type 1.yes  or  2.no  only");
				refactor = input.nextInt();
			}
		} while (reviewingQuestions);
	}

	public static void hard() {
		do {
			System.out.println("How many questions do you want to answer? ");
			int numOfQuestions = input.nextInt();
			if (numOfQuestions <= 0 || numOfQuestions > 20) {
				System.out.println("That number of questions isn't allowed");
				System.out.println("How many questions do you want to answer? ");
				numOfQuestions = input.nextInt();
			}
			for (int i = 0; i < numOfQuestions; i++) {
				beta();
			}
			String finalScore = "\nFinal score: " + score + "/" + numOfQuestions + "  " + Math.round((((double) score / (double) numOfQuestions) * 100)) + "%";
			System.out.println(finalScore);
			numerator += score;
			denominator += numOfQuestions;
			System.out.println("Running Total For Multiplication : " + numerator + "/" + denominator + " " + Math.round(((double) numerator / (double) denominator) * 100) + "%\n");
			System.out.println("Review of Questions Answered wrong: ");
			for (String each : reviewWrongQuestions) {
				System.out.println(each);
			}
			System.out.println("\n1. Return to menu  2. Exit");
			int refactor = input.nextInt();
			switch (refactor) {
			case 1:
				reviewWrongQuestions.clear();
				score = 0;
				numOfQuestions = 0;
				reviewingQuestions = false;
				break;
			case 2:
				reviewingQuestions = false;
				choosingMath = false;
				break;
			default:
				System.out.println("Type 1.yes  or  2.no  only");
				refactor = input.nextInt();
			}
		} while (reviewingQuestions);
	}
}
