// 37)WAP to print only Uppercase character from char[]

class  PrintUpperCase
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
		
		printUpperCase(ch);
	}
	public static void printUpperCase(char [] ch)
	{
		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i]>= 'A' && ch[i] <= 'Z')
			{
				System.out.print(ch[i]);
			}
		}
	}
}
