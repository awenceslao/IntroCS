import java.util.Scanner;
import java.util.InputMismatchException;


public class partB {
	static partB pb = new partB();
	Scanner scanLee = new Scanner(System.in);
	boolean singleNo = true;
	boolean singleYes = true;
	boolean marriedNo = true;
	boolean marriedYes = true;
	
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
					pb.singleReturnStatus();
					break;
				case 2:
					pb.marriedReturnStatus();
					break;
				default: 
					System.out.println("That is not an valid option");
				}
			}catch(InputMismatchException IME){
				System.out.println("Only Enter the number that correspond with your decision ");
				}
			
			}
	
	//Option 1: Singles method
	public void singleReturnStatus(){
		System.out.println("Answer 1. for yes, 2. for no");
		System.out.println("During 2013, were you either 65 years old (or older), or blind?");
			int singleAgeAnswer = scanLee.nextInt();
				switch(singleAgeAnswer){
				case 1:
					pb.singleYes();
					break;
				case 2:
					pb.singleNo();
					break;
				default:
					System.out.println("The response is not acceptable");
				}
	}
	
	
	public void singleNo(){
do{		
		System.out.println("Enter your unearned income: ");
		int singleNoUnearnedIncome = scanLee.nextInt();
			if(singleNoUnearnedIncome > 1000){
				singleNo = false;
			}
		System.out.println("Enter your earned income: ");
		int singleNoEarnedIncome = scanLee.nextInt();
			if(singleNoEarnedIncome > 6100){
				singleNo = false;
			}
		System.out.println("Enter your gross income");
		int singleNoGrossIncome = scanLee.nextInt();
			if(singleNoGrossIncome > 1000){
				singleNo = false;
			}
			else if(singleNoGrossIncome > (singleNoEarnedIncome + 350)){
				singleNo = false;
			}
			
	if(singleNoUnearnedIncome < 1000){
			pb.noTaxes();
		}
	else if(singleNoEarnedIncome < 6100){
		pb.noTaxes();
	}
	else if(((singleNoGrossIncome < 1000) || (singleNoGrossIncome < (singleNoEarnedIncome + 350)))){
		pb.noTaxes();
	}
	
}while(singleNo);
	pb.allTheTaxes();
	pb.taxes();
		
	}

	
	
	//blind/old
	public void singleYes(){
do{		
		System.out.println("Please Clarify your answer");
		System.out.println("1. I am 65 or older OR I am Blind    2. I am 65 or older AND blind");
		int legallyBlind = scanLee.nextInt();
			switch(legallyBlind){
			case 1:
				System.out.println("Enter your unearned income: ");
				int singleYesUnearnedIncome = scanLee.nextInt();
					if(singleYesUnearnedIncome > 2500){
						singleYes = false;
					}
				System.out.println("Enter your unearned income: ");
				int singleYesEarnedIncome = scanLee.nextInt();
					if(singleYesEarnedIncome > 7600){
						singleYes = false;
					}
				System.out.println("Enter your gross income: ");	
				int singleYesGrossIncome = scanLee.nextInt();
				if(singleYesGrossIncome > 2500){
						singleYes = false;
				}
				else if(singleYesGrossIncome > (singleYesEarnedIncome + 1850)){
						singleYes = false;
				}
				
		if(singleYesUnearnedIncome < 1000){
				pb.noTaxes();
			}
		else if(singleYesEarnedIncome < 6100){
				pb.noTaxes();
			}
		else if(((singleYesGrossIncome < 1000) || (singleYesGrossIncome < (singleYesEarnedIncome + 1850)))){
				pb.noTaxes();
			}	
		
				break;
			case 2:
				System.out.println("Enter your unearned income: ");
				int singleBOUnearnedIncome = scanLee.nextInt();
					if(singleBOUnearnedIncome > 4000){
						singleYes = false;
					}
				System.out.println("Enter your unearned income: ");
				int singleBOEarnedIncome = scanLee.nextInt();
					if(singleBOEarnedIncome > 9100){
						singleYes = false;
					}
				System.out.println("Enter your gross income: ");	
				int singleBOGrossIncome = scanLee.nextInt();
					if(singleBOGrossIncome > 4000){
						singleYes = false;
					}
					else if(singleBOGrossIncome > (singleBOEarnedIncome + 3350)){
						singleYes = false;
					}
					
		if(singleBOUnearnedIncome < 1000){
				pb.noTaxes();
			}
		else if(singleBOEarnedIncome < 6100){
				pb.noTaxes();
			}
		else if(((singleBOGrossIncome < 1000) || (singleBOGrossIncome < (singleBOEarnedIncome + 350)))){
				pb.noTaxes();
			}
		
				break;
			default:
				System.out.println("That is not an accepetable answer");
			}
			
}while(singleYes);
		
			pb.allTheTaxes();
			pb.taxes();
	}
	
	
	
	//Option 2: married method
	public void marriedReturnStatus(){
		System.out.println("During 2013, were you either 65 (or older), or blind ?");
			int marriedAgeAnswer = scanLee.nextInt();
			switch(marriedAgeAnswer){
			case 1: 
				pb.marriedYes();
				break;
			case 2: 
				pb.marriedNo();
				break;
			default:
				System.out.println("Please enter an acceptable answer only");
			}
			
	}

	
	
	public void marriedNo(){
do{		
		System.out.println("Enter your unearned income: ");
		int marriedNoUnearnedIncome = scanLee.nextInt();
			if(marriedNoUnearnedIncome > 1000){
				marriedNo = false;
			}
		System.out.println("Enter your earned income: ");
		int marriedNoEarnedIncome = scanLee.nextInt();
			if(marriedNoEarnedIncome > 6100){
				marriedNo = false;
			}
		System.out.println("Enter your gross income");
		int marriedNoGrossIncome = scanLee.nextInt();
			
			if(marriedNoGrossIncome > 1000){
				marriedNo = false;
			}
			else if(marriedNoGrossIncome > (marriedNoEarnedIncome + 350)){
				marriedNo = false;
			}
			
	if(marriedNoUnearnedIncome < 1000){
			pb.noTaxes();
		}
	else if(marriedNoEarnedIncome < 6100){
			pb.noTaxes();
		}
	else if(((marriedNoGrossIncome < 1000) || (marriedNoGrossIncome < (marriedNoEarnedIncome + 350)))){
			pb.noTaxes();
		}		
			
}while(marriedNo);
			pb.allTheTaxes();
			pb.taxes();
	}
	
	//blind/old
	public void marriedYes(){
do{		
		System.out.println("Please Clarify your answer");
		System.out.println("1. I am 65 or older OR I am Blind    2. I am 65 or older AND blind");
			int weLegallyBlind = scanLee.nextInt();
			switch(weLegallyBlind){
			case 1: 
				
				System.out.println("Enter your unearned income: ");
					int marriedYesUnearnedIncome = scanLee.nextInt();
						if(marriedYesUnearnedIncome > 2200){
							marriedYes = false;
							}
				System.out.println("Enter your earned income: ");
					int marriedYesEarnedIncome = scanLee.nextInt();
						if(marriedYesEarnedIncome > 7300){
							marriedYes = false;
							}
				System.out.println("Enter your gross income");
					int marriedYesGrossIncome = scanLee.nextInt();
						if(marriedYesGrossIncome > 2200){
							marriedYes = false;
								}
						else if(marriedYesGrossIncome > (marriedYesEarnedIncome + 1550)){
							marriedYes = false;
								}	
				if(marriedYesUnearnedIncome < 2200){
						pb.noTaxes();
					}
				else if(marriedYesEarnedIncome < 7300){
						pb.noTaxes();
					}
				else if(((marriedYesGrossIncome < 2200) || (marriedYesGrossIncome < (marriedYesEarnedIncome + 1550)))){
						pb.noTaxes();
					}		
					
			break;
			
			case 2: 
				
				System.out.println("Enter your unearned income: ");
				int marriedBOUnearnedIncome = scanLee.nextInt();
					if(marriedBOUnearnedIncome > 3400){
						marriedYes = false;
						}
			System.out.println("Enter your earned income: ");
				int marriedBOEarnedIncome = scanLee.nextInt();
					if(marriedBOEarnedIncome > 8500){
						marriedYes = false;
						}
			System.out.println("Enter your gross income");
				int marriedBOGrossIncome = scanLee.nextInt();
					if(marriedBOGrossIncome > 3400){
						marriedYes = false;
							}
					else if(marriedBOGrossIncome > (marriedBOEarnedIncome + 2750)){
						marriedYes = false;
							}	
			
			if(marriedBOUnearnedIncome < 3400){
					pb.noTaxes();
				}
			else if(marriedBOEarnedIncome < 8500){
					pb.noTaxes();
				}
			else if(((marriedBOGrossIncome < 3400) || (marriedBOGrossIncome < (marriedBOEarnedIncome + 350)))){
					pb.noTaxes();
				}						
			break;
			default:
				System.out.println("Unacceptable answer");

					}
}while(marriedYes);
	
			pb.allTheTaxes();
			pb.taxes();
	}
	
	
	
	public void noTaxes(){
		System.out.println("You do not have to file a tax return");
		System.exit(0);
	}
	
	public void allTheTaxes(){
		System.out.println("You must file a return statement");
	}
	
	
	public void taxes(){
		System.out.println("How will you be filing your taxes?");
		System.out.println("1. Single   2.Head of Household   3. Married Seperate   4. Married Jointly");
			int taxFilingMethod = scanLee.nextInt();
			switch(taxFilingMethod){
			case 1:
				pb.taxesSingle();
				break;
			case 2:
				pb.taxesHead();
				break;
			case 3:
				pb.taxesMarriedSeperate();
				break;
			case 4:
				pb.taxesMarriedJointly();
				break;
			default:
				System.out.println("That is not an acceptable option");
			}
		
	}
	
	
	
	public void taxesSingle(){
		double singleActual;
		
		System.out.println("Enter your taxable income: ");
		long taxableIncomeSingle = scanLee.nextLong();
		
		while(taxableIncomeSingle < 84000 || taxableIncomeSingle > 100000){
			System.out.println("That is not an acceptable range");
			System.out.println("Enter your taxable income: ");
			taxableIncomeSingle = scanLee.nextLong();
			
		}
		
		if(taxableIncomeSingle >= 84000 && taxableIncomeSingle < 87850){
			singleActual = (4991.25 + (.25 * ((taxableIncomeSingle - (taxableIncomeSingle % 50 ) + 25) - 36250 )) );
			System.out.println("Your tax amount is: " + singleActual );
		}
		else if(taxableIncomeSingle >= 87850 && taxableIncomeSingle < 100000){
			singleActual = (17891 + (.28 * ((taxableIncomeSingle - (taxableIncomeSingle % 50 ) + 25) - 87850 )) );
			System.out.println("Your tax amount is: " + singleActual);
		}
			
		 
	}
	
	public void taxesHead(){
		double headActual;
		
		System.out.println("Enter your taxable income: ");
		long taxableIncomeHead = scanLee.nextLong();
		
		while(taxableIncomeHead < 84000 || taxableIncomeHead > 100000){
			System.out.println("That is not an acceptable range");
			System.out.println("Enter your taxable income: ");
			taxableIncomeHead = scanLee.nextLong();
			
		}
		
		if(taxableIncomeHead >= 84000 && taxableIncomeHead < 100000){
			headActual = (6652.75 + (.25 * ((taxableIncomeHead - (taxableIncomeHead % 50 ) + 25) - 48600 )) );
			System.out.println("Your tax amount is: " + headActual );
		}
		
		
		
	}
	
	public void taxesMarriedJointly(){
		double jointlyActual;
		
		System.out.println("Enter your taxable income: ");
		long taxableJointly = scanLee.nextLong();
		
		while(taxableJointly < 84000 || taxableJointly > 100000){
			System.out.println("That is not an acceptable range");
			System.out.println("Enter your taxable income: ");
			taxableJointly = scanLee.nextLong();
			
		}
		
		if(taxableJointly >= 84000 && taxableJointly < 100000){
			jointlyActual = (9982.75 + (.25 * ((taxableJointly - (taxableJointly % 50 ) + 25) - 72500 )) );
			System.out.println("Your tax amount is: " + jointlyActual );
		}
		
		
	}
	
	public void taxesMarriedSeperate(){
		double seperateActual;
		
		System.out.println("Enter your taxable income: ");
		long taxableSeperate = scanLee.nextLong();
		
		while(taxableSeperate < 84000 || taxableSeperate > 100000){
			System.out.println("That is not an acceptable range");
			System.out.println("Enter your taxable income: ");
			taxableSeperate = scanLee.nextLong();
			
		}
		
		if(taxableSeperate >= 84000 && taxableSeperate < 100000){
			seperateActual = (14229.00 + (.28 * ((taxableSeperate - (taxableSeperate % 50 ) + 25) - 73200 )) );
			System.out.println("Your tax amount is: " + seperateActual );
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		pb.determineTaxReturnStatus();

		

		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	}	
}
