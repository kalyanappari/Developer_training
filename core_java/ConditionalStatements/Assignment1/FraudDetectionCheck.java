import java.util.Scanner;

class FraudDetectionCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Average Order Value: ");
		double avgOrderVal = sc.nextDouble();
		
		System.out.print("Enter Order Amount: ");
		double orderAmount = sc.nextDouble();
		
		String res = (orderAmount > avgOrderVal) ? "Order is Flagged for Review!" : "Order done!";
		
		System.out.println(res);
	}
}

/*Here we used to the Greater then relational Operator to check the fraud and this condition alone is not sufficient because the fraud some times
  may also less than the average value.
  
  And Small increase in the order amount compared avg does means fraud iff the difference in large number. this condition consider an order as 
  fraud it is jst increases + 1 then avg value.
  
  */