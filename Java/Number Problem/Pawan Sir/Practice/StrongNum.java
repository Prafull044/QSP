class  StrongNum
{
	public static void main(String[] args) 
	{
		System.out.println(isStrong(145));
	}
	
	public static boolean isStrong(int num )
	{
		int num2 = num;
		int sum = 0;
		while (num2 != 0)
		{
		int last = num2%10;
		sum = sum + fact(last);
		num2 /=10;
		
		}
		
		return sum == num;
	}
	
	public static int fact(int num)
	{
		int res= 1;
		for (int i = 1;i<= num ;i++ )
		{
			res = res * i;
		}
		return res;
	}
}


