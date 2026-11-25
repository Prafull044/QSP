// WAP to print only consonants in a given String
class  StringProgram13
{
	public static void main(String[] args) 
	{
        String str = "Apple";


        for(int i = 0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U')) 
			{
			   System.out.println(ch);	
			}
        }
    }
}