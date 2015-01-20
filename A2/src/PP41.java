import java.util.Scanner;

public class PP41 {
	Scanner scanLee = new Scanner(System.in);
	static PP41 runn = new PP41();
	
	public void leapYears(){
		System.out.println("Please enter a year: ");
		int year = scanLee.nextInt();
		
		if(year%4 == 0 && year%400 == 0 ){
			System.out.println(year + " is a leap year");
		}
		
		else if(year%100 == 0 ){
			System.out.println(year + " is not a leap year");
		}
		
		
	}
	
	public static void main(String[] args) {
		runn.leapYears();

	}

}
