// 4  3  2  1
// 5  6  7  8
// 12 11 10 9
// 13 14 15 16
class P26 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int b = n;
		
		for (int i =1;i<=n ;i++ )
		{
			for (int j =1 ;j<=n ;j++ )
			{
				if (i%2 != 0)
				{
					System.out.print(b-- +" ");
					if (b< 9)
					{
						System.out.print(" ");
					}
				}
				else
				{
					System.out.print(b++ +" ");
					if (b<= 10)
					{
						System.out.print(" ");
					}
					
				}
			}
			if (i%2 != 0)
				{
					b = b+n+1;
				}
				else
				{
					b= b + n-1;
				}
			System.out.println();
		}
	}
}
