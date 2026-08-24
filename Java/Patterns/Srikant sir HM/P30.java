// 16 15 14 13
// 12 11 10 9
// 8  7  6  5
// 4  3  2  1
class P30
{
	public static void main(String[] args) 
	{
		int n = 4;
		int num = n*n;
		for (int i =1 ;i<= n ;i++ )
		{
			for (int j = 1;j<=n ;j++ )
			{
				System.out.print(num-- +" ");
				if (num<9)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
