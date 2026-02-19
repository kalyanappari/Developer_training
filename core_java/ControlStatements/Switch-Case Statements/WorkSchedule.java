import java.util.Scanner;

class WorkSchedule
{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("--- Work Schedule ---");
		
		System.out.print("Enter the number from 1 to 7!");
		
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.println("Week Day it is!");
			    break;
			case 2:
				System.out.println("Week Day it is!");
			    break;
			case 3:
				System.out.println("Week Day it is!");
			    break;
			case 4:
				System.out.println("Week Day it is!");
			    break;
			case 5:
				System.out.println("Week Day it is!");
			    break;
			case 6:
				System.out.println("Weekend it is!");
			    break;
			case 7:
				System.out.println("Weekend it is!");
			    break;
			default:
				System.out.println("Enter the correct number!");
			
		}
	}
}
