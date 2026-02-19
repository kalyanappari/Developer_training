import java.util.Scanner;
class ExceptSeven 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		//Printing the numbers in which the seven doesn't exists.
		
		System.out.print("Enter the num1: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the num2: ");
		int n = sc.nextInt();
		
		for(int i=m;i<n;i++){
			
			boolean isExit = false;
			
			int num = i;
			
			while(num > 0)
			{
				int rem = num % 10;
				
				if(rem == 7){
					isExit = true;
					break;
				}
				
				num /= 10;
			}
			
			if(!isExit)System.out.print(i + " ");
			
		}
	}
}
