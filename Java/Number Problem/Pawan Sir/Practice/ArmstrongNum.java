class ArmstrongNum 
{
	static int sum ;
	public static void main(String[] args) 
	{
		System.out.println(isArmstrong(153));
	}
	
	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		int tSum = power(num,ct);
		return tSum == num ;
		
	}
		
	public static int power(int num, int ct)
	{
		while (num != 0)
		{
		  int last = num % 10;
			
		  int res = 1;
		  
		for (int i = 1; i<= ct; i++)
		{
			res = res * last;
		}
		 
		sum += res;
		num /= 10;
       }
	   return sum;
	}
		
	public static int count(int num)
	   {
		int count = 0;
		while (num != 0)
		{
			count++ ;
			num /= 10;
	    }
		return count;
	   }
}
