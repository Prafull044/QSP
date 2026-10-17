class Harshad
{
	public static void main(String[] args) 
	{
		System.out.println(isHarshad(17));
	}
	
	public static boolean isHarshad(int num)
	{
		int sum = 0;
		int n1 = num;
		while (num != 0)
		{
			sum = sum + num %10;
			num /= 10;
			
		}
			return n1%sum == 0;
	
	}
}
