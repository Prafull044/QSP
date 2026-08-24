class P3
{
	public static void main(String[] args) 
	{
		int n = 11;
		int b = 3;
		for (int i=1;i<= n ;i++ )
		{
			for (int j =1;j<=n ;j++)
			{
				if ( i<= b|| j<=b|| i>=n-b+1 || j>=n-b+1)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}