// a b c d
// e f g 1
// h i 2 3
// j 4 5 6
class P42
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
				if (i+j > n+1)
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