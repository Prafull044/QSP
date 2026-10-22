//23.WAP to print Average of ASCII value

class AvgOfASCII
{
	public static void main(String[] args) 
	{
	   
	   char[] ch = {'M', 'N', 'O'};
        System.out.print(avgAscii(ch));

	}
	
	public static int avgAscii(char ch[])
	{
		int sum = 0;
		for (int i = 0;i<ch.length ;i++ )
		{
	      sum += ch[i];
		}
	
		return sum / ch.length ;
		
	}
	
}


