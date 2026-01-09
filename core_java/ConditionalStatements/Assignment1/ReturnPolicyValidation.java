import java.util.Scanner;

class ReturnPolicyValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter order date {DD} : ");
		int orderDate = sc.nextInt();
		
		System.out.print("Enter returning Date {DD} : ");
		int returnDate = sc.nextInt();
		
		String res = ((orderDate - returnDate) > 7) ? "Return Date Exceeds" : "Order Returned!";
		
		System.out.println(res);
	}
}
