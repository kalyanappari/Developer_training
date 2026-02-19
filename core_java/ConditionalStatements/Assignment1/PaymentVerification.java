import java.util.Scanner;

class PaymentVerification 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Order Amount: ");
		Double orderAmount = sc.nextDouble;
		
		System.out.print("Enter Payed Amount: "
		Double payedAmount = 150.50;
		
		String res = (orderAmount == payedAmount) ? "Valid Payment!" : "Not Payed Exact Amount!";
		
		System.out.println(res);
		
	}
}
