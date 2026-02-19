import java.util.Scanner;
class BankAccountStatus 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		double minBalance = 1000;
		int maxLimit = 5;
		
		System.out.print("Enter your account balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Enter the number of transaction: ");
		int numOfTrans = sc.nextInt();
		
		if(balance > minBalance){
			
			if(numOfTrans > maxLimit){
				System.out.println("Your account is frozen, please try after 24 hrs!");
			}
			else{
				
				System.out.println("Transaction is successfull!");
				
			}
		}
		else{
			System.out.println("Low balance!");
		}
		
		sc.close();
	}
}
