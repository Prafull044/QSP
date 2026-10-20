// 17)WAP to print product of Odd elements
class producOfOddEle
{
	public static void main(String[] args) 
	{
		int [] arr = {10, 20, 30, 40, 50};
		System.out.println("product of even elements"+ prodOfoddEle(arr));
	}
	
	public static int prodOfoddEle(int num[])
	{
		int prod = 1;
		
		for (int i =0;i<num.length ; i++ )
		{
			if (num[i] % 2 != 0)
			{
				prod *= num[i];
			}
		}
		return prod;
	}
}
