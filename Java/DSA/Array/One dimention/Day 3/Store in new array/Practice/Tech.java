class  Tech
{
	public static void main(String[] args) 
	{
		int [] arr = {12,33,44,55,145,153,8,3,25,4, 2025};
		check(arr);
	}
	
	public static void check(int [] arr)
	{
		for (int i = 0;i<arr.length ;i++ )
		{
		    if(isTech(arr[i]))
		    {
		    	System.out.println(arr[i]);
		    }
		}
	}
	
	
	public static boolean isTech(int num)
	{
		
		int ct = count(num);
		int first = num / ct;
		int seco = num % ct;
		
		int sum = first + sec;
		
		return num == (sum * sum);
	}
	
	public static int count(int num)
	{
		int count= 0;
		while (num != 0)
		{
			count++;
			num /= 10;
		}
		
		int ct = 1;
		for (int i = 1;i<= count/2 ;i++ )
		{
			ct *= 10;
		}
		return ct;	
	}
}
