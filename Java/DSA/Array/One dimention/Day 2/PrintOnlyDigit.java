// 7.WAP to print only digits from char[]

class  PrintOnlyDigit
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', '7', '@', 'b', '#', '9', '$', '3', 'M'};
		
		printOnlyDigit(ch);
	}
	public static void printOnlyDigit(char [] ch)
	{
		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] >= '0' && ch[i] <= '9')
			{
				System.out.print(ch[i] + " ");
			}
		}
	}
}