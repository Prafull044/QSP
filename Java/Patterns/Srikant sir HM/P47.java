// 1 h 5 d
// 2 g 6 c
// 3 f 7 b
// 4 e 8 a
class P47
{
	public static void main(String[] args) 
	{
		int n = 4;
		int num ;
		for (int i = 1;i<=n ;i++ )
		{
			num = i;
			for (int j =1;j<=n ;j++ )
			{
				if (j%2 != 0)
				{
					System.out.print(num +" ");
				}
				else
				{
					char ch = (char)('a'+ (n*n)/2 - num);
					System.out.print(ch +" ");
					num = num + n;
				}
			}
			System.out.println();
		}
	}
}
