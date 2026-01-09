import java.util.Scanner;
class OnlineCourseAccess 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- online Course Access---");
		
		System.out.print("Is course is active(true/false): ");
		boolean isActive =sc.nextBoolean();
		
		System.out.print("Enter Fee Status(paid/unpaid): ");
		String feeStatus = sc.next();
		
		System.out.print("Do student have Scholarship(true/false): ");
		boolean hasScholarShip = sc.nextBoolean();
		
		if(isActive)
		{
			if(feeStatus.equals("paid") || hasScholarShip){
				
				System.out.println("Course is Accessible!");
			}
			else{
				
				System.out.println("To Access you need to pay or you should have active scholarship!!");
			}
		}
		else{
			
			System.out.println("Course is not active any more. Try other course!");
		}
		sc.close();
	}
}
