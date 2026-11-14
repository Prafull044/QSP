class Count
{
	public static void main(String[] args) 
	{
		int num = 1234345;
		System.out.println(count(num));
	}
	
	public static int count(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		return 1 + count(num / 10);
	}
}
