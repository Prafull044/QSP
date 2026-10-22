// 10.WAP to print odd index character from char[]

class  OddIndex
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		OddIndexArray(ch);
	}
	
	public static void OddIndexArray(char ch[])
	{
		for (int i = 0; i < ch.length ;i++ )
		{
			if (i % 2 != 0)
			{
				System.out.print(ch[i] + " ");
			}
		}
	}
}