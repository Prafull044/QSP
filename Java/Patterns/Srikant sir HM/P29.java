// 4  3  2  1
// 8  7  6  5
// 12 11 10 9
// 16 15 14 13
class P29
{
	public static void main(String[] args) 
	{
		int n = 4;
		int num = n;
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
			num = num+ (n*2);
			System.out.println();
		}
	}
}