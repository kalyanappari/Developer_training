import java.util.Scanner;
class BankTransaction
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the balance: ");
		double bal = sc.nextDouble();
		
		System.out.printl("Enter the withdraw amount: ");
		double withDraw = sc.nextDouble();
		
		String mes = transactionVal(bal,withDraw);
		
		System.out.println(mes);
	}
	public static String transactionVal(double bal,double withDraw){
		
		if(withDraw > 0 && withDraw < bal){
			
			return "Successfull Transaction!";
		}
		return "Transaction Failed!";
	}
}
