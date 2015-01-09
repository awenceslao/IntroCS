import java.util.Scanner;

public class partA {
	Scanner input = new Scanner(System.in);
	
	
	public void run(){
		boolean taxes = true;
		boolean yn = true;
		String repno = "Your Dependent is a non resident alien for U.S. tax purposes";
		String repyes = "Your Dependent is a resident alien for U.S. tax purposes";
		
		
		System.out.println("We will now determine the legal status of your dependent");
		System.out.println(" ");
		System.out.println("Type yes or no");
		
		do{
		
			System.out.println("Was your dependent physically present in the U.S. on at least 31 days during the year 2013?");
			String answer = input.nextLine().toLowerCase();		
					if(answer.equalsIgnoreCase("no")){
							System.out.println(repno);
							System.exit(0);
						}
					else if(answer.equalsIgnoreCase("yes")){
						
						}
					
					while(answer != "yes" || answer != "no"){
						System.out.println("Invalid choice");
					}
		
				
			System.out.println("How many days has your dependent lived in the U.S. during the years: 2011, 2012, and 2013.");
		//3 answers, 3 scanners
		//2011 scanner answer divided by 6
		//2012 scanner answer divided by 3
		//2013 scanner answer()
		
		//int totalDaysInUS = 2011 answer + 2012 answer + 2013 answer
		//if totalDaysInUS >= 183 next question
		//if totalDaysInIS < 183 - repno
		
		
		System.out.println("Was your dependent physically present in the U.S. for at least 183?");
		//if yes, repyes
		//if no, next question
		
		System.out.println("In 2013, did your dependent have a tax home in a foreign country and a closer connection to that foreign country than to the U.S.?");
		//if yes, repyes
		//if no, repno
		
		}while(taxes);
}
	
	
	
	
	
	
	
	
	
	


	
	
	
	public static void main(String[] args){
		partA pA = new partA();
		pA.run();
		
	}

}
