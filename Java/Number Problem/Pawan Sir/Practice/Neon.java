class Neon 
{
	public static void main(String[] args) 
	{
		System.out.println(isNeon(10));
	}
	
	public static boolean isNeon(int num)
	{
		int sqr = num * num;
		int sum = 0;
		while (sqr != 0)
		{
			sum = sum + sqr%10;
		    sqr /= 10;
		}
		
		return num == sum ;
		
	}
}
