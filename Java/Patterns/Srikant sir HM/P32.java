//  27 24 21
//  18 15 12
//  9  6  3  
class P32
{
	public static void main(String[] args) 
	{
		int n = 3;
		int num = n*n*n;
		for (int i =1 ;i<= n ;i++ )
		{
			for (int j = 1;j<=n ;j++ )
			{
				System.out.print(num +" ");
				if (num<10)
				{
					System.out.print(" ");
				}
				num = num- n;
				
			}
			System.out.println();
		}
	}
}