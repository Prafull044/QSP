// 7.WAP to Print Sum of Negative Elements
class  SumOfNegative
{
	public static void main(String[] args) 
	{
		int [] arr = {-10, 20, -30, 40, -50};
		System.out.println("Sum of Negative elements "+ sumOfNige(arr));
    }
	
	public static int sumOfNige(int num[] )
	{   
		int sum = 0;
		for (int i = 0;i< num.length ;i++ )
		{
			if (num[i] < 0)
			{
				sum += num[i];
			}
		}
		return sum;
	}
	
}
