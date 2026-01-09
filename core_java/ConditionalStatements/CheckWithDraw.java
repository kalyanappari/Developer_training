class CheckWithDraw 
{
	public static void main(String[] args) 
	{
		
		int balance = 5000;
		
		int withdraw = 500;
		
		String res = (withdraw > 0 && withdraw <= balance) ? "Is Possible to withdraw" : "Not Possible to withdraw";
		
		System.out.println(res);
		
	}
}
