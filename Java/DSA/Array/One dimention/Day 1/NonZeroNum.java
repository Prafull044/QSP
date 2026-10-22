// 24)WAP to print only non-zero numbers

class  NonZeroNum
{
	public static void main(String[] args) 
	{
		int [] arr = {0, 10, 20, 0, 30, 40, 0, 50};
          NegaEle(arr);
    }
	
	public static void NegaEle(int num[] )
	{   
		for (int i = 0;i< num.length ;i++ )
		{
			if (num[i] > 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}