import java.util.InputMismatchException;
import java.util.Scanner;

public class A {
		Scanner scanLee = new Scanner(System.in);
		static A beh = new A();
		boolean q1 = true;
		boolean q2 = true;
		boolean q3 = true;
		boolean taxes = true;
		String yes = "Your Dependent is a resident alien for U.S. tax purposes";
		String no = "Your Dependent is a resident alien for U.S. tax purposes";
	
	public void run(){
do{		
		System.out.println("We will now determine the legal status of your dependent");
		System.out.println(" ");
		System.out.println("Type yes or no");
		
		//Question 1
		System.out.println("Was your dependent physically present in the U.S. on at least 31 days during the year 2013?");
		String answer = scanLee.nextLine().toLowerCase();
		
			do{
				if(answer.equalsIgnoreCase("no")){
					taxes = false;
					}
				else if(answer.equalsIgnoreCase("yes")){
					q1 = false;
					}
				
				else{
					System.out.println("Invalid choice, answer yes or no only");
					System.out.println("Was your dependent physically present in the U.S. on at least 31 days during the year 2013?");
					answer = scanLee.nextLine().toLowerCase();
					}
			}while(q1);
		
			

		//Question 2
	do{		
	try{	
		System.out.println("How many days has your dependent lived in the U.S. during the years: 2011, 2012, and 2013.");
		System.out.print("2011: " );
			int days1 = scanLee.nextInt();
			while(days1 > 365 || days1 < 0){
					System.out.println("Not a valid answer");
					days1 = scanLee.nextInt();
				}
		System.out.print("2012: " );
			int days2 = scanLee.nextInt();
			while(days2 > 365 || days2 < 0){
					System.out.println("Not a valid answer");
					days2 = scanLee.nextInt();
				}
		System.out.print("2013: " );
			int days3 = scanLee.nextInt();
			while(days3 > 365 || days3 < 0){
					System.out.println("Not a valid answer");
					days3 = scanLee.nextInt();
				}
		
		//Math time
			int sum1 = days1/6;
			int sum2 = days2/3;
			int totalDaysInUs = sum1 + sum2 + days3;
				
			if(totalDaysInUs < 183){
				taxes = false;
			}
			if(days3 >= 183){
				 beh.answerIsYes();
			}
			else{
				q2 = false;
			}
					
	}catch(InputMismatchException IME){
			System.out.println("Enter numbers only");
			}
	}while(q2);	
	
	
	//Question 3
		System.out.println("In 2013, did your dependent have a tax home in a foreign country and a closer connection to that foreign country than to the U.S.?");
			String answer2 = scanLee.nextLine().toLowerCase();
				do{	
					if(answer2.equalsIgnoreCase("no")){
						beh.answerIsYes();
					}
				else if(answer2.equalsIgnoreCase("yes")){
						q3 = false;
					}
				else{
					System.out.println("answer yes or no only");
					System.out.println("In 2013, did your dependent have a tax home in a foreign country and a closer connection to that foreign country than to the U.S.?");
					answer2 = scanLee.nextLine().toLowerCase();
					}			
				}while(q3);
}while(taxes);

	System.out.println(no);

	}
	
	
	public void answerIsYes(){
		System.out.println(yes);
		System.exit(0);
	}
	
	
	public static void main(String[] args) {
		beh.run();

	}

}
