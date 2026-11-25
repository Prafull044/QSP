// WAP to print only Lowercase character in a given String
class StringProgram6
{
	public static void main(String[] args) 
	{
		String str = "PrafULL";
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				System.out.println(str.charAt(i));
 			}
		}
	}
}
