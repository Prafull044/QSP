// WAP to print each character ASCII value in a given String
class StringProgram4 
{
	public static void main(String[] args) 
	{
		String str = "Prafull";
		
		for(int i = 0; i<str.length();i++)
		{
			System.out.println((int)str.charAt(i));
		}
	}
}
