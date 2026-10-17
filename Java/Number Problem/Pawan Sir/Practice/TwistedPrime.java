class  TwistedPrime
{
	public static void main(String[] args) 
	{
		System.out.println(isEmirpNum(13));
	}
	
	public static boolean isEmirpNum(int num)
	{
		if (isPrime(num))
		{
		  int reverse = ReverseNum(num);
		  
			if (isPrime(reverse))
			{
				return true;
			}
			return false;
			
		}	
		else{
			return false;
		}
     }
	
	public static int ReverseNum(int num)
	{
		int rev = 0;
		while (num != 0)
		{
		  rev = rev * 10  + (num%10) ; 
		  num /= 10;
			
		}
		return rev;
	}
	
	
	public static boolean isPrime(int num)
	{
		if (num == 1)
		{
			return false;
		}
		else{
			for (int i = 2;i< num ;i++ )
			{
				if (num%i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}
}
