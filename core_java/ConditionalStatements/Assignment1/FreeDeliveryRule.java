import java.util.Scanner;

class FreeDeliveryRule
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the price of product: ");
		
		int price = sc.nextInt();
		
		String res = (price >= 499) ? "Your Delivery is free!!" : "Your Delivery is charged!!";
		
		System.out.println(res);
		
	}
}

// Here we use the Greater Than or equals to operator to check whether the price is more the or equals to 499, Even if the price is 499 it allows the free delivery!

