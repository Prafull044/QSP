class Automorphic
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
		    if(isAuto(arr[i]))
		    {
		    	System.out.println(arr[i]);
		    }
		}
	}
	
	public static boolean isAuto(int num)
	{
		return (num * num) % count(num) == num;
	}
	
	public static int count(int num)
	{
		int count = 1;
		while (num != 0)
		{
			count *= 10;;
			num /= 10;
		}
		return count;
	}
}
