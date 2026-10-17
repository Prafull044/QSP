class PalindromNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isPalindrom(33));
	}
	
	public static boolean isPalindrom(int num)
	{
		return num == reverse(num) ;
	}
	
	public static int reverse(int num)
	{ 
		int res = 0;
		while (num != 0)
		{
			res = res * 10  + num %10;
			num /= 10;
		}
		return  res;
	}
}
