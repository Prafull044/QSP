// 30.WAP to print first lowercase in char[]

class FirstLowerCase
{
	public static void main(String[] args) 
	{
		char[] ch = {'@', 'A', '7', 'n', 'B'};

		System.out.println(firstVowel(ch));
	}
	
	public static char firstVowel(char ch [])
	{
		for (int i = 0;i< ch.length ;i++ )
		{
			if (ch[i]>= 'a' && ch[i] <= 'z')
			{
				return ch[i];
			}
		}
		return '\0';
	}
}