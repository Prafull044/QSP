class strong
{
	public static void main(String[] args) 
	{
		int [] arr = {12,33,44,55,145,783,333,3222233,908};
		isStrong(arr);
	}
	
	
	public static void isStrong(int [] arr)
	{    
		
		for (int i = 0;i<arr.length ;i++ )
		{
			if(isStrong(arr[i]))
			{
				System.out.println("Strong num"+ arr[i]);
			}
		}
		
	}
	
	public static boolean isStrong(int num)
	{
		int n = num;
		int sum = 0;
		while (num != 0)
			{
				sum += factorial(num % 10);
				num /= 10;
			}
			return sum == n;
	}
		
		public static int factorial(int num)
		{
			int fact = 1;
			for(int i = 1; i<= num ; i++)
			{
				fact *= i;
			}
			return fact;
		}
		
	}
