import java.util.Scanner;

class CountNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Counting the number between range which are divisible by 7.
		
		System.out.print("Enter the num1: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the num2: ");
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i=m;i<n;i++){
			
			if(i % 7 == 0){
				count++;
			}
		}
		System.out.println("the count of numbers between given range which are divisible by 7 are: " + count);
		
	}
}
