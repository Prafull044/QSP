// WAP to count only consonants ina given String
class  StringProgram15
{
	public static void main(String[] args) 
	{
        String str = "Apple";
        int count = 0;
   
        for(int i = 0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U')) 
			{
			   count++;	
			}
        }
		System.out.println(count);
    }
}
