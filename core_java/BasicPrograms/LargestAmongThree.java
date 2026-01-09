class LargestAmongThree
{
	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int midres = (a > b) ? a : b;
		
		int res = (midres > c) ? midres : c;
		
		System.out.println(res);
	}
}