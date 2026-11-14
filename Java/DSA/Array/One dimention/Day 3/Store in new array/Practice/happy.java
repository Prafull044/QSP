class happy
{
  public static void main(String[] args) 
	{
		int [] arr = {12,33,44,55,145,153,10,19,908};
		check(arr);
	}
	
	public static void check(int [] arr)
	{
		for (int i = 0;i<arr.length ;i++ )
		{
		    if(isHappy(arr[i]))
		    {
		    	System.out.println(arr[i]);
		    }
		}
	}
	
	
	public static boolean isHappy(int num)
	{
		while (num != 1 && num != 4)
		{
			num = isSum(num);
		}
		return num == 1;
	}
	
	public static int isSum(int num)
	{ 
		int sum = 0;
		while (num != 0)
		{
			sum = sum + (num % 10) * (num % 10);
			num /= 10;
		}
		return sum;
	}
}
