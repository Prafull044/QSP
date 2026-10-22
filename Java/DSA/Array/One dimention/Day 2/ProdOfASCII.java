// 24.WAP to print product of Ascii value character
class ProdOfASCII
{
	public static void main(String[] args) 
	{
	   
	   char[] ch = {'A', 'B', 'C'};
        System.out.print(ProdAscii(ch));

	}
	
	public static int ProdAscii(char ch[])
	{
		int prod = 1;
		for (int i = 0;i<ch.length ;i++ )
		{
	      prod *= ch[i];
		}
	
		return prod;
		
	}
	
}