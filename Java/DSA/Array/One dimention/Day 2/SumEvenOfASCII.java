// 21.WAP to print sum of even ASCII value characters
class SumEvenOfASCII
{
	public static void main(String[] args) 
	{
		char[] ch = {'B', 'c', 'D', 'e'};
		int sum = 0;
		for (int i = 0;i<ch.length ;i++ )
		{
			if (ch[i] % 2 == 0)
			{
			
			sum += ch[i];
			}
		}
		System.out.println(sum);
		
		
	}
}