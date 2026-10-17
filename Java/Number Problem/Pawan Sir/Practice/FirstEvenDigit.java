class FirstEvenDigit
{
	public static void main(String[] args) 
	{
		int num = 1234813;
		
		while (num != 0)
		{
		    int last = num%10;
		
		    if (last % 2 == 0)
		    {
		    	System.out.println(last);
		    	break;
		    }
		    num /= 10;
		}
		
	}
}
