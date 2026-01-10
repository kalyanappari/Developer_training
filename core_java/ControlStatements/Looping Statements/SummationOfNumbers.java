import java.util.Scanner;
class  SummationOfNumbers
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the num1: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the num2: ");
		int n = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=m;i<n;i++){
			
			if(i%2 == 0){
				evenSum += i;
			}
			else{
				oddSum += i;
			}
		}
		System.out.println("Even Sum is: " + evenSum);
		System.out.println("Odd Sum is: " + oddSum);
	}
}
