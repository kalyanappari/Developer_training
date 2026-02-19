class LowerCaseCheck 
{
	public static void main(String[] args) 
	{
		char ch = 'a';
	
		String res = (ch >= 'a' && ch <= 'z') ? "LowerCase" : "NotLowerCase";
		
		System.out.println(res);
	}
}
