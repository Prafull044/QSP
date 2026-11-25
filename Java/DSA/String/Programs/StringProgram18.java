// WAP to count spaces in a given String
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
				count++;
			}
		}
		System.out.println(count);
	}
}




