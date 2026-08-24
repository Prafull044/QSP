class P5
{
	public static void main(String[] args) 
	{
		int n = 5;
		int b = 2;
		for (int i=1;i<= n ;i++ )
		{
			for (int j =1;j<=n ;j++)
			{
				if (i>=n-b+1 || i<= b ||j==1|| j==n|| i==j )
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