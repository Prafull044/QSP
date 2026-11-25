public interface NumberPrograms
{
	double pi = 22.0/7.0 ;
	
	void areaOfCircle(int rad) ;
	
	void perimeterOfCircle(int rad);
	
	static boolean isPrime(int num)
	{
		if(num == 0) return true;
		if(num <= 1) return false;
		

		int deno = 2;
		while(deno < num)
		{
			if(num % deno == 0)
			{
				return false;
			}
			deno++;
		}
		return true;
	}
	
	boolean isArmstrong(int num);
	
	void squarePattern(int n);
	
	boolean twistedPrime(int num);
	
	boolean isPalindrome(int num);
	
	static int reverse(int num)
	{
		int rev = 0;
		
		while(num!= 0)
		{
			rev = rev * 10 +(num%10);
			num /= 10;
		}
		return rev;
	}
}