// 34.WAP to print last consonant from char[]

class  lastConso
	{
	public static void main(String[] args) 
	{ 
		char[] ch = {'A', 'k', 'e', 'M', 'o', 't'};
		System.out.println(lastCon(ch));
	}
	
	public static char lastCon(char ch [])
	{
		for (int i = ch.length -1;i>= 0 ;i--)
		{
			if (!(ch[i] = 'A' ||  ch[i] = 'E' || ch[i] = 'I' || 
				ch[i] = 'O' || ch[i] = 'U' || ch[i] = 'a' ||
				ch[i] = 'e' || ch[i] = 'i' || ch[i] = 'o' ||
				ch[i] = 'u' ))
			{
				return ch[i]; 
			}
		}
		return '\0';
	}
}
