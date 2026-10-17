// 14)WAP to print middle element of an array
class  SumOfMiddleElement
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50};
		sumMidle(arr);
	}
	
	public static void sumMidle(int num [])
	{
	   if (num.length % 2 != 0)
	   {
		       int i =num.length / 2 ;
			   System.out.println(num[i]);
	   }
	   else
		{
			System.out.println("Midle number is not Available");
		}
	   
	}
	
}