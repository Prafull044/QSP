class  MagicNum
{
	public static void main(String[] args) 
	{
		int [] arr = {12,33,44,55,145,153,8,3,25,4, 123};
		check(arr);
	}
	
	public static void check(int [] arr)
	{
		for (int i = 0;i<arr.length ;i++ )
		{
		    if(isMagic(arr[i]))
		    {
		    	System.out.println(arr[i]);
		    }
		}
	}
	
	public static boolean isMagic(int num)
	{ 
		while (num>9)
		{
		    int sum = 0;
		    while (num != 0)
		    {
		    	sum += (num%10);
		    	num /= 10;
		    }
			num = sum;
		}
		return num == 1;
	}
	
}
