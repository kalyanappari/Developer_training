import java.util.Scanner;

class LoanEligibilityChecker 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Loan Amount Calculator---");
		
		System.out.print("Enter the credit score: ");
		
		int cs = sc.nextInt();
		
		System.out.print("Enter the loan amount required: ");
		
		double lm = sc.nextInt();
		
		System.out.print("Enter the existing EMI's: ");
		
		double emis = sc.nextInt();
		
		System.out.print("Enter the Monthly Income: ");
		
		double income = sc.nextInt();
		
		System.out.println("Enter Tennure periods(months): ");
		
		int tmonths = sc.nextInt();
		
		String res = LoanCalc(lm,cs,income,emis,tmonths);
		
		System.out.println(res);
		
	}
	
	public static String LoanCalc(double lm,double cs,double income,double emis,int tmonths){
		
		if(cs >= 650){
			
			double availableEMI = (0.7 * income) - emis;
			
			double r = 0.1/12;
			
			double emitoPay = lm * ((r * Math.pow((1+r),tmonths)) / (Math.pow((1+r),tmonths) - 1));
				
			if(emitoPay > availableEMI){
				
				return "EMI to pay is: " + emitoPay + "\nWhich exceeds available EMI\nPlease try to increase tenure period or decrease loan amount for eligiblity";
			}
			else{
				return "You are eligible for this loan amount\nYour EMI per month is: " + emitoPay;
			}	
		}
		else{
			
			return "Not Eligible as credit score is not met!";
			
		}
	}
}
