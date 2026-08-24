// 1  5  9 13
// 2  6 10 14
// 3  7 11 15
// 4  8 12 16
class P28
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i =1 ;i<= n ;i++ )
		{
			int num = i;
			for (int j = 1;j<=n ;j++ )
			{
				System.out.print(num +" ");
				num = num+ n;
				if (num<10)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
