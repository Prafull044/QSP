class SumOfArray 
{
	public static void main(String[] args) 
	{
		int [] a = {10,20,30,40};
		System.out.println("Sum of array" +  sum(a));
	}
	
	public static int sum(int[] num)
	{
		int sum = 0;
		for(int i = 0; i<num.length; i++)
		{
			sum = sum + num[i];
		}
		return sum;
	}
}

