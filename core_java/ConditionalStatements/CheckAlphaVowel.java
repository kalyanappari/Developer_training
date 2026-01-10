class CheckAlphaVowel 
{
	public static void main(String[] args) 
	{
		char ch = 'e';
		
		String res = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' 
		             
					 || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Alpha Vowel" : "Consonant";
					 
		System.out.println(res);
	}
}
