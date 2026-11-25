// WAP to checck particular character is present or not
     //                                                                                       
class StringProgram16 
{
	public static void main(String[] args) 
	{
		String str = "Apple";
        char ch = 'A';
   
        for(int i = 0 ; i<str.length() ; i++)
		{
			if(ch == str.charAt(i))
			{   System.out.println("True");
				return ;
			}
        }
		System.out.println("False");
	}
}
