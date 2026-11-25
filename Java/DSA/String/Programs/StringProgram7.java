//WAP to print only Digits in a given String
class StringProgram
{
	public static void main(String[] args) 
	{
		String str = "P1rafU01LL3";
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				System.out.println(str.charAt(i));
 			}
		}
	}
}
