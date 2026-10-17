// 31)WAP to print only if it is single digit 

class  SingleDigitNum
{
	public static void main(String[] args) 
	{
		int [] arr = {5, 12, 7, 145, 99, 3, 456};
          Num(arr);
    }
	
	public static void Num(int num[] )
	{    
		int prod = 1;
		for (int i = 0;i< num.length ;i++ )
		{
			if (num[i] < 10)
			{
			   System.out.println(num[i]);
			}
		}	
	}
}