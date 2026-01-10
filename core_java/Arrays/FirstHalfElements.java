import java.util.Scanner;
class FirstHalfElements 
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
		
		System.out.print("First half of elements are: ");
		
		for(int i=0;i<size/2;i++){
			
		  System.out.print(arr[i] + " ");
			
		}
	}
}