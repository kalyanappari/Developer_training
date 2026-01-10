import java.util.Scanner;

class NumberswithFive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Printing the count numbers in which the five exists bw the given range.
		
		System.out.print("Enter the num1: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the num2: ");
		int n = sc.nextInt();
		int count = 0;
		for(int i=m;i<n;i++){
			
			boolean isExit = false;
			
			int num = i;
			
			while(num > 0)
			{
				int rem = num % 10;
				
				if(rem == 5){
					isExit = true;
					break;
				}
				
				num /= 10;
			}
			
			if(isExit)count++;
		}
		System.out.println("Count: " + count);
	}
}
