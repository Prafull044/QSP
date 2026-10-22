// 5.WAP to print only Special character from char[]


class  PrintSpecialChar
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', 'e', '#', 'I', '@', 'm', 'o', 'P', '$', 'u', '7'};
		
		printUpperCase(ch);
	}
	public static void printUpperCase(char [] ch)
	{
		for (int i = 0;i < ch.length ;i++ )
		{
			if (!(ch[i]>= 'a' && ch[i] <= 'z' )&& !(ch[i]>= 'A' &&
				ch[i] <= 'Z') &&  !(ch[i] >= '0' && ch[i] <= '9'))
			{
				System.out.print(ch[i] + " ");
			}
		}
	}
}