// 1 a b c
// 2 3 d e
// 4 5 6 f
// 7 8 9 10

class P40
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
				if (j<=i)
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