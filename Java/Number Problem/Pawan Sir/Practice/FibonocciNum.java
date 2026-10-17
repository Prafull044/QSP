class FibonocciNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isFibonocci(9));
	}
	
	public static boolean isFibonocci(int num)
	{
		int a = 0;
		int b = 1;
		int ans;
		
		while (true)
		{
			ans  = a+b;
			if (a == num)
			{
				return true;
			}
			else if (a > num)
			{
				return false;
			}
			
			a = b;
			b = ans;
		}
	}
}
