import java.util.Scanner;
import java.util.Arrays;

class OddIndexElements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements!");
		
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Even Index elements are: ");
		
		for(int i=0;i<size;i++){
			
			if(i % 2 != 0) System.out.print(arr[i] + " ");
			
		}
	}
}
