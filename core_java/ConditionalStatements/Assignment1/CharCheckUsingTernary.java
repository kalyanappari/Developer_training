class CharCheckUsingTernary 
{
	public static void main(String[] args) 
	{
		char ch = '^';
		
		
		boolean isAlpha = (ch >= 'A' && ch <= 'Z') && (ch >= 'a' && ch <= 'z');
		boolean uc = ch >= 'A' && ch <= 'Z';
		boolean lc = ch >= 'a' && ch <= 'z';
        boolean ucv = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
		boolean lcv = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
		boolean dig = ch >= '0' && ch <= '9';
		
		
		String res = isAlpha ? "Alphabet : " + (uc ? "Upper case : " + (ucv ? "Vowel" : "Consonant") : "Lower case : " + (lcv ? "Vowel" : "Consonant")) : dig ? "Digit!" : "Special Character";
					 
		System.out.println(res);
		
		/*String result = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? 
			            ((ch <= 'Z') ? 
			            ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ?
		                "Upper Case Vowel" : "Upper Case Consonant") :
			            ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ?
			             "Lower Case Vowel" : "Lower Case Consonent")) :
		                ((ch >= '0' && ch <= '9') ? "Number" : "Special Character");
			          
        System.out.println(result);*/
	}
}
