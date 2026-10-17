class RecursionArmStrong
{
	public static void main(String[] args) 
	{
		System.out.println(isArmstrong(153));
	}
	
	public static boolean isArmstrong(int num)
	{
		int ct = count(num ,0);
		int sum = power(num, 0, ct);
		return sum == num;
	}
	
	public static int count(int num , int count)
	{
		if(num == 0)
		{
			return count;
		}
		else if(num>0)
		{
			count ++;
		}
		return count(num/10, count);	
	}
	
	public static int power(int num, int sum , int ct)
	{
		int last;
		if(num >0)
			{
				last = num %10;
			}
			else
			{
				return sum;
			}
			
		sum = sum +  sumOfDigitPower(last , 1 , ct);
		
		return power(num/10, sum, ct);
	}
		
	public static int sumOfDigitPower(int last , int pow , int ct)
	{
		if (ct == 0)
		{
			return pow;
		}
		else
		{
			pow = last * pow;
		}
		return sumOfDigitPower(last , pow , ct -1);
	}
	
}

