class StringProgram11 
{
	public static void main(String[] args) 
	{
		String str = "P1rafU01LL3";
		
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
