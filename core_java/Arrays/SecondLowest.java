import java.util.Scanner;
import java.util.Arrays;
class SecondLowest
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
		
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i] < min1) {
				min2 = min1;
				min1 = arr[i];
			}
			else if(arr[i] < min2 && arr[i] != min1)
			{
				min2 = arr[i];
			}
			
		}
		System.out.println("Second Smallest element: " + min2);
	}
}


