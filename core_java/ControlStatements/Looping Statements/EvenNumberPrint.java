import java.util.Scanner;
class EvenNumberPrint 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the num1: ");
		int m = sc.nextInt();
		
		System.out.print("Enter the num2: ");
		int n = sc.nextInt();
		
		for(int i=m;i<n;i++){
			
			if(i%2 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
