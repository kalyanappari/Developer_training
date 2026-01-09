import java.util.Scanner;

class EvenAlphabet
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Even Alphabets are: ");
		
		for(int i='A';i<='Z';i++){
			
			if(i%2 == 0){
				System.out.print((char)i + " ");
			}
		}
	}
}
