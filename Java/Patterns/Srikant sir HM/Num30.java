// 4  8  12 16
// 3  7  11 15
// 2  6  10 14
// 1  5  9 13
class Num30
{
	public static void main(String[] args) 
	{
		int n = 4;
		int num = n;
		for (int i =1 ;i<= n ;i++ )
		{
			for (int j = 1;j<=n ;j++ )
			{
				System.out.print(num +" ");
				if (num<9)
				{
					System.out.print(" ");
				}
				num = num+ n;
			}
			num = n-i;
			System.out.println();
		}
	}
}