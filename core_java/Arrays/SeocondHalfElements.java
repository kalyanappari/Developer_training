import java.util.Scanner;
class SeocondHalfElements 
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
		
		System.out.print("Second half of elements are: ");
		
		for(int i=size/2;i<size;i++){
			
		  System.out.print(arr[i] + " ");
			
		}
	}
}