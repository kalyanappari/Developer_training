import java.util.Scanner;
class DiscountCal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the cost of product for 1 unit: ");
		
		double oneUnit = sc.nextInt();
		
		System.out.print("Enter the no. of units required: ");
		
		double noofUnits = sc.nextInt();
		
		double totalCost = noofUnits * oneUnit;
			
		
		if(totalCost > 1000){
			
			double discountPrice = (0.1) * totalCost;
			System.out.println("Hey we got 10% discount!");
			System.out.println("Your total cost for product is: " + (totalCost - discountPrice));
			
		}
		else{
			
			System.out.println("Your total cost for product is: " + (totalCost));
			
		}

		sc.close();
	}
}
