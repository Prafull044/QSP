class factorsOfNumbers
{
	public static void main(String[] args) 
	{
		factors(22 , 1);
	}
	
	public static void factors(int num , int deno)
	{
		if(num % deno == 0)
		{
			System.out.println(deno);
		}
		
		if(num < deno)
		{
			return;
		}
		
		factors(num, deno + 1);
	}
}
