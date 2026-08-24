 // 1 h 2 g
 // 3 f 4 e
 // 5 d 6 c
 // 7 b 8 a
class Num56
{
	public static void main(String[] args) 
	{
		int n = 4;
		int a = 1;
		
		char b = (char)('a'-1 +(n*n)/2);
		
		for (int i= 1 ;i<= n ;i++ )
		{
			for (int j = 1;j<= n ;j++ )
			{
				if (j%2 != 0)
				{
					System.out.print(a++ +" ");
				}
				else
				{
					System.out.print(b-- +" ");
				}
			}
			System.out.println();
		}
	}
}

