class LoanCalculator 
{
	public static void main(String[] args) 
	{
		
		double amount = 1000;
		double interestRate = 10.0;
		double tennure = 5;
		
		double interest = (amount * interestRate * tennure) / 100;
		
		double totalAmount = amount + interest;
		
		double emiPerMonth = (totalAmount / tennure) / 12;
		
		System.out.println("Total Amount: " + totalAmount);
		
		System.out.println("EMI per Month: " + emiPerMonth);
		
	}
}
