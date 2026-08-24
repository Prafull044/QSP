class Diamond
{
	public static void main(String[] args) 
	{
		int n =4;
		
		// first half
		for (int i = 1; i<= n;i++ )
		{
		for (int j =1; j<=n; j++)
		{
			if (i+j >= n+1)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print(" ");
			}
		}
			System.out.println();
		}
		
	   // second half
		for (int i = n; i>=1;i-- )
		{
		for (int j =1; j<=n; j++)
		{
			if (i+j >= n+1)
			{
				System.out.print("*"+" ");
			}
			else
			{
				System.out.print(" ");
			}
		}
			System.out.println();
		}
			
	}
}
