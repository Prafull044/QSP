// 6.WAP to print only alphabet character from char[]
class  PrintCharOnly
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
			if ((ch[i]>= 'a' && ch[i] <= 'z' ) ||  (ch[i]>= 'A' &&
				ch[i] <= 'Z'))
			{
				System.out.print(ch[i] + " ");
			}
		}
	}
}