import java.util.Scanner;
class OnlineCabBooking 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Is Driver Available for service (true/false): ");
			
		boolean isDriver = sc.nextBoolean();
		sc.nextLine();
		
		if(isDriver){
			
			System.out.println("Driver Details!");
			
			System.out.print("Enter the name (Driver): ");
			
			String name = sc.nextLine();
			
			System.out.println("Your driver name is:" + name);
			
			System.out.print("Enter your location for service check: ");
		
		    String location = sc.nextLine();
			
			if(location.equals("jalandhar") || location.equals("phagwara") || location.equals("Amritsar") || location.equals("ludhiana")){
				
				System.out.println("Your Location is servable!!");
				
				System.out.print("Please enter your payment mode: ");
				
				String paymentMode = sc.nextLine();
				
				if(paymentMode.equals("cash") || paymentMode.equals("upi") || paymentMode.equals("card")){
					
					System.out.print("Hey, your payment method is availale. your ride will start in few seconds!!"); 
				}
				else{
					
					System.out.print("Sorry! Payment mode not accepted!");
				}
			
			}
			else{
				
				System.out.print("Sorry! your location is not servable!!");
			}
		
		}
		else{
			
			System.out.print("Drivers are not avaliable!!");
		}
		
		sc.close();
			
	}
}
