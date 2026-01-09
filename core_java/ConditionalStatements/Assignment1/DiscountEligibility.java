import java.util.Scanner;
class  DiscountEligibility
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of your cart: ");
		
		int value = sc.nextInt();
		
		String res = (value > 2000) ? "Discount applied" : "Add More for Discount";
		
		System.out.println(res);
		
	}
}
