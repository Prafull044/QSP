// 21)WAP to print only +ve elements in an given array

class  PositiveEle
{
	public static void main(String[] args) 
	{
		int [] arr = {-10, 20, -30, 40, 50, -60};
          posiEle(arr);
    }
	
	public static void posiEle(int num[] )
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