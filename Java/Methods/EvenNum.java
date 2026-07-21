class EvenNum
{
	public static void main(String[] args) 
	{
		for (int i = 1;i<= 1000 ; i++ )
		{
			if(isEven(i))
			{
				System.out.println(i);
			}
		}
	}
		
		public static boolean isEven(int i)
		{
			if (i % 2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
}