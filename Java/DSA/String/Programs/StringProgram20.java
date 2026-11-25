// WAP to count character in a given String excluding Space
class StringProgram18
{
	public static void main(String[] args) 
	{
		int count = 0;
		String str  = "Prafull Prafull";
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i) == ' ')
			{
			  continue;
			}
			count++;
		}
		System.out.println(count);
	}
}
