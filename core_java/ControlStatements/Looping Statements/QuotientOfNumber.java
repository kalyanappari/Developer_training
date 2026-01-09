import java.util.Scanner;
class QuotientOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Quotient of given numbers without division.
		
		System.out.print("Enter the num1: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the num2: ");
		int n = sc.nextInt();
		
		int sum = n;
		int count = 0;
		
		while(sum <= m){
			count++;
			sum += n;
		}
		System.out.println("Quotient is: " + count);
		
	}
}
