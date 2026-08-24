 // 8 a 7 b
 // 6 c 5 d
 // 4 e 3 f
 // 2 g 1 h
class Num55
{
	public static void main(String[] args) 
	{
		int n = 4;
		int a = ((n*n)/2);
		
		char b = 'a';
		
		for (int i= 1 ;i<= n ;i++ )
		{
			for (int j = 1;j<= n ;j++ )
			{
				if (j%2 != 0)
				{
					System.out.print(a-- +" ");
				}
				else
				{
					System.out.print(b++ +" ");
				}
			}
			System.out.println();
		}
	}
}
