// 22.WAP to print sum of odd ASCII value characters


class SumOddOfASCII
{
	public static void main(String[] args) 
	{
	   
	   char[] ch = {'A', 'b', 'C', 'd', 'E'};

		int sum = 0;
		for (int i = 0;i<ch.length ;i++ )
		{
			if (ch[i] % 2!= 0)
			{
			
			sum += ch[i];
			}
		}
		System.out.println(sum);
		
		
	}
}

