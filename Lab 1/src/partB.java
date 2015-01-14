import java.util.Scanner;
import java.util.InputMismatchException;


public class partB {
	static partB PB = new partB();
	Scanner scanLee = new Scanner(System.in);
	
	//master run method
	public void determineTaxReturnStatus(){
	try{	
		System.out.println("This program will now help determine if your dependent will be required "
														+ "to file a return");
		System.out.println(" ");
		System.out.println("Choose an option to continue: ");
		System.out.println("1. Single Dependent  2. Married Dependent");
			int maritalStatus = scanLee.nextInt();
				switch(maritalStatus){
				case 1:
					PB.singleReturnStatus();
					break;
				case 2:
					PB.marriedReturnStatus();
					break;
				default: 
					System.out.println("That is not an valid option");
				}
			}catch(InputMismatchException IME){
				System.out.println("Only Enter the number that correspond with your decision ");
				}
			
			}
	
	//Option 1 method
	public void singleReturnStatus(){
		System.out.println("Were you at least 65 in the year 2013?");
			String singleAgeAnswer = scanLee.nextLine().toLowerCase();
			
			if(singleAgeAnswer.equalsIgnoreCase("yes") ){
				
			}
			else if(singleAgeAnswer.equalsIgnoreCase("no")){
				
			}
			else{
				System.out.println("The response is not acceptable");
				System.out.println("Were you at least 65 in the year 2013?");
				singleAgeAnswer = scanLee.nextLine().toLowerCase();
			}
	}
	
	//Option 2 method
	public void marriedReturnStatus(){
		System.out.println("Married");
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		PB.determineTaxReturnStatus();
	}	
}
