// 6.WAP to print sum of Positive elements
class  SumOfPositive
{
	public static void main(String[] args) 
	{
		int [] arr = {-10, 20, -30, 40, 50};
		System.out.println("Sum of Positive elements "+ sumOfPosi(arr));
    }
	
	public static int sumOfPosi(int num[] )
	{   
		int sum = 0;
		for (int i = 0;i< num.length ;i++ )
		{
			if (num[i] > 0)
			{
				sum += num[i];
			}
		}
		return sum;
	}
	
}
