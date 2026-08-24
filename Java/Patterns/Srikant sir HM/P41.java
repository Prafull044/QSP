// 1 2 3 4
// 5 6 7 a
// 8 9 b c
// 10 d e f
class P41
{
	public static void main(String[] args) 
	{
		int n = 4;
		int num = 1;
		char ch = 'a';
		for (int i = 1;i<=n ;i++ )
		{
			for (int j =1;j<=n ;j++ )
			{
				if (i+j <= n+1)
				{
					System.out.print(num++ +" ");
				}
				else
				{
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}
}