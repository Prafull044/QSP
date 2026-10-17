class PerfectNum 
{
	static int sum =0;
	public static void main(String[] args) 
	{
		System.out.println(isPerfect(6));
	}
	
	public static boolean isPerfect(int num)
	{
		for (int i = 1;i< num ; i++ )
		{
			if (num % i == 0)
			{
			  sum = sum + i;
			}
		}
		return num == sum;
	}
}
