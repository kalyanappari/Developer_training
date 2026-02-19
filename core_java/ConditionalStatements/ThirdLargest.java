class ThirdLargest
{
	public static void main(String[] args) 
	{
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		//int midres = 0;
		
		//int res1 = (c > (midres = (a > b) ? a : b ))? c : midres;
		
		int res2 = (a>b && a>c) ? a : (b > c) ? b : c;
		
		//System.out.println(res1);
		
		System.out.println(res2);
		
	}
}
