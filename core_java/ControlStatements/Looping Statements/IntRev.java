import java.util.Scanner;
class IntRev 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the num: ");
		
		int num = sc.nextInt();
		
		String res = "";
		
		while(num > 0){
			
			int rem = num % 10;
			
			res += rem;
			
			num /= 10;
		}
		System.out.println(Integer.parseInt(res));
	}
}
