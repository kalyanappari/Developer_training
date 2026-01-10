import java.util.Scanner;

class QuantityLimit 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the item: ");
		
		String item = sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter no. of units: ");
		
		int n = sc.nextInt();
		
		String res = (n <= 5) ? "Order Successful" : "Units Limit exceed!!";
		
		System.out.println(res);
		
	}
}

//Less than or equals relational operator ensures that the units does not exists 5 to make order!
