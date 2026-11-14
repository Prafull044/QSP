class Prime
{
	public static void main(String[] args) 
	{
		System.out.println(isPrime(11, 2));
	}
	
	public static boolean isPrime(int num , int deno)
	{
		if(num <= 1)
		{
			return true;
		}
	
		if(num == deno) return true;
		
		if(num % deno == 0) 
		{
			return false;
		}
		
		return isPrime(num , deno +1);
	
	}
}
