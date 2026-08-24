// 1  a 5  e
// 2  b 6  f
// 3  c 7  g
// 4  d 8  h
class P33
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i =1 ;i<= n ;i++ )
		{
			int num = i;
			char ch = (char)('a'+i-1);
			for (int j = 1;j<=n ;j++ )
			{
				if (j%2 != 0)
				{
                    System.out.print(num +" ");
				   if (num<10)
				   {
					System.out.print(" ");
				    }
				     num = num+ n;
				}
				else
				{  
					 System.out.print(ch +" ");
					 ch =(char)( ch + n);
				}
			}
			System.out.println();
		}
	}
}