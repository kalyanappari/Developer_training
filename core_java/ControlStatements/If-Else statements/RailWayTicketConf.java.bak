import java.util.Scanner;

class RailWayTicketConf 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Welcome to Railway Booking Portal ---");
		
		System.out.print("Enter the available seats: ");
		
		int seatsAvail = sc.nextInt();
		
		System.out.print("Is RAC available for train (true/false): ");
		
		boolean isRac = sc.nextBoolean();
		
		if(seatsAvail > 0){
			System.out.println("Your ticket is confirmed!!");
		}
		else if(isRac){
			System.out.println("Your ticker is WaitListed!!");
		}
		else{
			System.out.println("Your ticket got cancelled due to unavailability!");
		}
	}
}
