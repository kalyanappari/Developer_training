import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Math Calculator ---");
		
		System.out.println("Please Enter \n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division"); 
		
		System.out.print("Enter your choice: ");
		
		int choice = sc.nextInt();
		int num1,num2;
		
		switch (choice)
		{
			
			case 1:
				System.out.print("Enter number 1: ");
	            num1 = sc.nextInt();
		        System.out.print("Enter number 2: ");
		        num2 = sc.nextInt();
				System.out.println("Addtion of given numbers: " + (num1 + num2));
			    break;
			
			case 2:
				System.out.print("Enter number 1: ");
	            num1 = sc.nextInt();
		        System.out.print("Enter number 2: ");
		        num2 = sc.nextInt();
			    System.out.println("Subtraction of given numbers: " + (num1 - num2));
			    break;
				
			case 3:
				System.out.print("Enter number 1: ");
	            num1 = sc.nextInt();
		        System.out.print("Enter number 2: ");
		        num2 = sc.nextInt();
			    System.out.println("Multiplication of given numbers: " + (num1 * num2));
			    break;
				
			case 4:
				System.out.print("Enter number 1: ");
	            num1 = sc.nextInt();
		        System.out.print("Enter number 2: ");
		        num2 = sc.nextInt();
				System.out.println("Division of given numbers: " + (num1 / num2));
			    break;
				
			default:
				System.out.println("Please enter the correct choice!!");
		}
	}
}
