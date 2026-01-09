import java.util.Scanner;
class ATMOperation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------ ATM Operation Selection ------");
		
		System.out.print("Enter your account number: ");
		
		long accountNum = sc.nextInt();
		
		Double accountBal = 0.00;
		
		while(true){
			
			System.out.println("Please Enter \n1 for Withdraw\n2 for Deposit\n3 for Balance Enquiry\n4 for Exit");
			
			System.out.print("Enter your choice:");
			
			int choice = sc.nextInt();
			switch (choice)
			{
				case 1:
					System.out.print("Enter amount for withdraw: ");
				    double amount = sc.nextDouble();
				
					if(amount > 0 && amount < accountBal){
						accountBal -= amount;
						System.out.println("With Draw Successfull!!"); 
					}
					else if(amount < 0)
					{
						System.out.println("Withdraw amount shouldn't be zero!!");
					}
					else{
						System.out.println("Account balance is less than withdraw amount!!");
					}
					break;
				
				case 2:
					System.out.print("Enter you account number: ");
				    long acno = sc.nextInt();
					System.out.print("Enter the amount to deposit: ");
				    double d2 = sc.nextDouble();
					
					if(acno == accountNum){
						accountBal += d2;
						System.out.println("Deposit Successfull!!");
					}
					else{
						System.out.println("Your account is incorrect please verify!!");
					}
				    break;
					
				case 3:
					System.out.println("Your current account balance is: " + accountBal);
				    break;
				
				case 4:
					System.out.println("Thank you! Visit Again!");
				    return;
				
				default:
					System.out.println("Please enter the correct choice!!");
			
			}
			
			
		}
	}
}
