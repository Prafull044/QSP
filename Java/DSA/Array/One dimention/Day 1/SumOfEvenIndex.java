 // 9)WAP to Print Sum of Elements at Even Index
 
 class  SumOfEvenIndex
{
	public static void main(String[] args) 
	{
		int [] arr = {10, 20, 30, 40, 50};
		System.out.println("Sum of Even index elements "+ sumOfEven(arr));
    }
	
	public static int sumOfEven(int num[] )
	{   
		int sum = 0;
		for (int i = 0;i< num.length ;i++ )
		{
			if (i % 2 == 0)
			{
				sum += num[i];
			}
		}
		return sum;
	}
	
}
