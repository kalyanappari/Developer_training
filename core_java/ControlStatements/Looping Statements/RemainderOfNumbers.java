import java.util.Scanner;
class RemainderOfNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Remainder of given numbers without division or modulus.
		
		System.out.print("Enter the num1: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the num2: ");
		int n = sc.nextInt();
		
		int sum = n;
		
		while(sum <= m){
			sum += n;	
		}
		
		System.out.println("Remainder is: " + (m-(sum-n)));
	}
}
