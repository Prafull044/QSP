// 31.WAP to print first special character in char[]
class FirstSpecial
{
	public static void main(String[] args) 
	{
		char[] ch =  {'A', '7', '$', 'm', '#'};
		System.out.println(firstVowel(ch));
	}
	
	public static char firstVowel(char ch [])
	{
		for (int i = 0;i< ch.length ;i++ )
		{
			if (!((ch[i]>= 'A' && ch[i] <= 'Z')
				 || (ch[i]>= 'a' && ch[i] <= 'z')
				  || (ch[i] >= '0' && ch[i] <= '9')))
			{
				return ch[i];
			}
		}
		return '\0';
	}
}