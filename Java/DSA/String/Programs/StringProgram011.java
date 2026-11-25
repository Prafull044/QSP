// Count only digit in a given String
class StringProgram011 
{
	public static void main(String[] args) 
	{
		String str = "P1rafU01LL3";
		int count = 0;
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				count++;
 			}
	    }
		System.out.println(count);
	}
}
