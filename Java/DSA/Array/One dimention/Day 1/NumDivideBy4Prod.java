/// 30)WAP to print product of elements if it is divisible by 4
class  NumDivideBy4Prod
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
			if (num[i] % 4 == 0)
			{
				prod *= num[i];
			}
		}
			System.out.println(prod);
		
	}
}