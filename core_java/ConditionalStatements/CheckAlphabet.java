class  CheckAlphabet
{
	public static void main(String[] args) 
	{
		char ch1 = 'a';
		char ch2 = '1';
		
		System.out.println(checkAlphabetOrNot(ch1));
		System.out.println(checkAlphabetOrNot(ch2));
	}
	public static boolean checkAlphabetOrNot(char ch){
		
		return ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ? true : false;
		
	}
}
