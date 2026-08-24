class P36 
{
	public static void main(String[] args) 
	{
		int n = 4;
		char ch = (char)('a'+ (n*n)/2 -1);
		for (int i =1;i<=n ;i++ )
		{
			int a = i;
			
			for (int j =1;j<=n ;j++ )
			{
				if (j%2 != 0)
				{
					System.out.print(a +" ");
					a = a+ n;
				}
				else
				{
					System.out.print(ch +" ");
					ch = (char)(ch - 3);
				}
			}
			ch = (char)(ch + n +1);
			System.out.println();
		}
	}
}
