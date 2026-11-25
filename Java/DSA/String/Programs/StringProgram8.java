// WAP to count only uppercase character in a given String
class StringProgram8
{
	public static void main(String[] args) 
	{
		String str = "PrafULL";
		int count = 0;
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				count++;
 			}
		}
		System.out.println(count);
	}
}
