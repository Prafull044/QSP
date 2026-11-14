class Neon
{
	public static void main(String[] args) 
	{
		int [] arr = {12,9,44,55,145,153,8,3,25,4, 2025};
		check(arr);
	}
	
	public static void check(int [] arr)
	{
		for (int i = 0;i<arr.length ;i++ )
		{
		    if(isNeon(arr[i]))
		    {
		    	System.out.println(arr[i]);
		    }
		}
	}
	
	public static boolean isNeon(int num)
	{
		int sqr = num * num;
		int sum =0;
		while (sqr != 0)
		{
			sum += (sqr%10);
			sqr /= 10;
		}
	   
	   return sum == num;
	}
	

}
