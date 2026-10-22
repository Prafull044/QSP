// 18.WAP to print last 3 character from char[]
class Printlast3char
{
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
		
		for (int i = ch.length-3 ;i<ch.length;i++ )
		{
				System.out.print(ch[i] +" ");
		}
	}
}