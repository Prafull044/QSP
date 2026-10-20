class SumOfEvenDigit
{
	public static void main(String[] args) 
	{
		int [] arr = {10,5,8,7,3,9};
		System.out.println("SumOfEvenDigit" +SumOfEvenDigit(arr));
	}
	public static int SumOfEvenDigit(int [] num)
	{
		int sum = 0;
		for (int i =0;i<num.length ;i++ )
		{
			if (num[i] % 2 == 0)
		        {
				sum = sum + num[i];
		         }
		}
		return sum;
		
	}
}
