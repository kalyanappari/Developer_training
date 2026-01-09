import java.util.Scanner;
class AvgFirstHalfElements 
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
		
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<size/2;i++){
			sum += arr[i];
			count++;
		}
		
		System.out.print("Avg of first half of elements are: " + (double) sum/count);
		
	}
}