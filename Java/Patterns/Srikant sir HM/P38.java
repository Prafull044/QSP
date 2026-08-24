//8 a 4 e
//7 b 3 f
//6 c 2 g
//5 d 1 h
class P38
{
	public static void main(String[] args) 
	{
		int n = 4;
		int num ;
		for (int i =1;i<=n ;i++ )
		{
			num =(n*n)/2- i+1;
			
			for (int j =1;j<=n ;j++ )
			{
				if (j%2 != 0)
				{
					System.out.print(num +" ");
				}
				else
				{
					char ch = (char)('a'+(n*n)/2 - num);
					System.out.print(ch +" ");
					num = num - n;
				}
			}
			
			System.out.println();
		}
	}
}