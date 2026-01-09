import java.util.Scanner;
class LoginAuthentication
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the username: ");
		String username = sc.nextLine();
		
		System.out.print("Enter the password: ");
		String pass = sc.nextLine();
		
		String mes = LoginVal(username,pass);
		
		System.out.println(mes);
	}
	public static String LoginVal(String username,String pass){
		
		
		String userAdded = "kalyan_appari";
		
		String passAdded = "Amma@3023";
		
		if(username.equals(userAdded) && pass.equals(passAdded)){
			return "202 Login Successfull!";
		}
		return "404 user not found!!";
		
	}
}
