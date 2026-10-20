// 28.WAP to print first consonant in char[]

class Firstcon
{
	public static void main(String[] args) 
	{
		char[] ch = {'@', '3', 'A', 'k', 'e', 'M'};;
		System.out.println(firstVowel(ch));
	}
	
	public static char firstVowel(char ch [])
	{
		for (int i = 0;i< ch.length ;i++ )
		{
			if (!(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' ||
				ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'a' ||
				ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' ||
				ch[i] == 'u') && (ch[i]>= 'A' && ch[i] <= 'Z')
				 || (ch[i]>= 'a' && ch[i] <= 'z'))
			{
				return ch[i];
			}
		}
		return '\0';
	}
}