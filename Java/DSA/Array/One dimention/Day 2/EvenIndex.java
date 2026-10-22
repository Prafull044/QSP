// 9.WAP to print even index character from char[]

class  EvenIndex
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		EvenIndexArray(ch);
	}
	
	public static void EvenIndexArray(char ch[])
	{
		for (int i = 0; i < ch.length ;i++ )
		{
			if (i % 2 == 0)
			{
				System.out.print(ch[i] + " ");
			}
		}
	}
}
