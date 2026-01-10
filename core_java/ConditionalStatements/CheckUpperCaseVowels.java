class CheckUpperCaseVowels 
{
	public static void main(String[] args) 
	{
		
		char ch = 'A';
		
		String res = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Upper Vowels" : "Consonants";
		
		System.out.println(res);
		
	}
}
