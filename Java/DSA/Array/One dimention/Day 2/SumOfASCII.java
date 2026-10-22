///19.WAP to print sum of All character ASCII value

class SumOfASCII
{
	public static void main(String[] args) 
	{
		char[] ch = {'J', 'a', 'v', 'a'};
		int sum = 0;
		for (int i = 0;i<ch.length ;i++ )
		{
			sum += ch[i];
		}
		System.out.println(sum);
		
		
	}
}
