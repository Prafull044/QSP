class PrimeN
{
	public static void main(String[] args) 
	{
		int num = 17;
		int count = 0;
		
		if (num<= 1)
		{
			System.out.println("The no is not a Prime number");
		}
		else
			{
				for (int i = 2;i< num ; i++)
				{
					if (num % i == 0)
					{
						count++;
					}
				}
				
				if (count > 0)
				{
					System.out.println("The no is not a Prime number");
				}
				else
				{
					System.out.println("the no is Prime Number");
				}
			}
	}
}
