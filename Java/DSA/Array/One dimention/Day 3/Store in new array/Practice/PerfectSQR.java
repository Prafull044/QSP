class PerfectSQR
{
	public static void main(String[] args) 
	{
		int [] arr = {12,33,44,55,145,153,8,3,25,4};
		check(arr);
	}
	
	public static void check(int [] arr)
	{
		for (int i = 0;i<arr.length ;i++ )
		{
		    if(isPerfectSqr(arr[i]))
		    {
		    	System.out.println(arr[i]);
		    }
		}
	}
	
	public static boolean isPerfectSqr(int num )
	{
		for (int i =1;i<= num/2 ;i++ )
		{
			if (i*i == num)
			{
				return true;
			}
		}
		return false;
	}
	
}
