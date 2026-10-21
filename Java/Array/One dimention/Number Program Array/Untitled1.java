class HarshadNum 
{
	public static void main(String[] args) 
	{
		int [] arr = {12,34,55,33,31,59,39,29,18};
		isHarshadNum(arr);
	}
	int count = 0;
	
	
	public static void index(int [] num)
	{
		for (int i = 0;i<num.length ;i++ )
		{
			if (isHarshadNum(num[i]))
			{
				count++;
				System.out.println(num[]);
			}
		}
	}
	
	public static boolean isHarshadNum(int num)
	{
		int n = num;
		int sum = 0;
		for (int i = 0;i<num.length ;i++ )
		{
			while (num != 0)
			{
				sum = sum + num%10;
			}
		}
		return n/sum == 0;
	}
}
