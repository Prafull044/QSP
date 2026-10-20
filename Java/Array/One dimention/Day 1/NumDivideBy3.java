// 25)WAP to print if it is divisible by 3

class  NumDivideBy3
{
	public static void main(String[] args) 
	{
		int [] arr = {5, 12, 7, 145, 99, 3, 456};
          Num(arr);
    }
	
	public static void Num(int num[] )
	{   
		for (int i = 0;i< num.length ;i++ )
		{
			if (num[i] % 3 == 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}