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
	
	
	
	//still need to capture score as percent and spit out wrong answers
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		easy();
		//Beta(4, 5, 1);
	}

}
