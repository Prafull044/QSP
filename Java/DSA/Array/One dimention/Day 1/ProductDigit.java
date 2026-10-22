class ProductDigit
{
	public static void main(String[] args) 
	{
		int [] arr = {1,5,3,4};
		System.out.println("ProdDigit " +SumOfEvenDigit(arr));
	}
	public static int SumOfEvenDigit(int [] num)
	{
		int prod = 1;
		for (int i =0;i<num.length ;i++ )
		{
			prod = prod  * num[i];
		}
		return prod;
		
	}
}
