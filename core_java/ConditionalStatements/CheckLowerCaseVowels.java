class CheckLowerCaseVowels 
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		
		String res = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Lower Vowel" : "Consonant";
		
		System.out.println(res);
	}
}
