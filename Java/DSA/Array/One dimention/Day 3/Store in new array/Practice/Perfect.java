class  Perfect
{
	public static void main(String[] args) 
	{
		int [] arr = {12,33,44,55,145,153,8,3,908};
		check(arr);
	}
	
	public static void check(int [] arr)
	{
		for (int i = 0;i<arr.length ;i++ )
		{
		    if(isPerfectNo(arr[i]))
		    {
		    	System.out.println(arr[i]);
		    }
		}
	}
	
	
	public static boolean isPerfectNo(int num)
	{   
		int sum = 0;
		for (int i = 1;i<num ;i++ )
		{
		  if (num % i == 0)
		  {
			  sum += i;
		  }
		}
		return sum == num;
	}
}
