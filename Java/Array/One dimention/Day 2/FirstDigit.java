// 32.WAP to print first digit character in char[]
class FirstDigit
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', '#', 'm', '5', '9'};
		System.out.println(firstVowel(ch));
	}
	
	public static char firstVowel(char ch [])
	{
		for (int i = 0;i< ch.length ;i++ )
		{
			if (ch[i] >= '0' && ch[i] <= '9')
			{
				return ch[i];
			}
		}
		return '\0';
	}
}