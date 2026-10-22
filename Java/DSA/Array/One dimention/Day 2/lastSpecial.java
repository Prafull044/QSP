// 38.WAP to print last special character from char[]
class  lastSpecial
	{
	public static void main(String[] args) 
	{ 
		char[] ch = {'@', 'A', '#', '7', '$', 'm'};
		System.out.println(lastCon(ch));
	}
	
	public static char lastCon(char ch [])
	{
		for (int i = ch.length -1;i>= 0 ;i--)
		{
			if (!(ch[i]>= 'A' && ch[i] <= 'z' || 
				ch[i]>= 'a' && ch[i] <= 'z' ||
				ch[i]>= '0' && ch[i] <= '9'))
			{
				return ch[i]; 
			}
		}
		return '\0';
	}
}
