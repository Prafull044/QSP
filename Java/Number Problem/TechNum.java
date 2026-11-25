class TechNum
{
	public static void main(String[] args) 
	{   int num = 25;
		System.out.println(isTech(num));
	}
	
	public static boolean isTech(int num)
	{
		int ct = count(num);
     	return (num * num) % ct == num;
	}
	public static int count(int num)
	{
		int value = 1;
		while(num != 0)
		{
			value = value * 10;
			num /= 10;
		}
		return value;
	}
}
