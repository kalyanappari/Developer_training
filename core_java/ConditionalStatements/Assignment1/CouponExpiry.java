import java.util.Scanner;
import java.time.LocalDate;

class CouponExpiry
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		String expDate = "2025-12-31";
		
		System.out.print("Enter the CurDate in format {YYYY-MM-DD} : ");
		
		String curDate = sc.nextLine();
		
		LocalDate d1 = LocalDate.parse(expDate);
		
		LocalDate d2 = LocalDate.parse(curDate);
		
		String res = (d2.isBefore(d1)) ? "Coupon Valid" : "Coupon Expired";
		
		System.out.println(res);
		
	}
}
