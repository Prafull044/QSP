// 1 8 9 16
// 2 7 10 15
// 3 6 11 14
// 4 5 12 13
class P27
{
	public static void main(String[] args) 
	{
		int n =4;
		int a = n*2-1;
		int b = 1;
		 
		for (int i = 1;i<=n ; i++)
		{
			int num = i;
			for (int j =1;j<=n ;j++ )
			{
				if (j%2 != 0)
				{
					System.out.print(num +" ");
					num = num+a;
					 
				}
				else
				{
					System.out.print(num +" ");
					num = num + b;
					 
				}
			}
			a = a-2;
			b = b+2;
			
			System.out.println();
			
		}
	}
}
