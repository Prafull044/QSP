class LeapYearCount 
{
	public static void main(String[] args) 
	{
		int year = 2000;
		int count = 0;
		
		while (year<= 2050)
		{
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) )
			{
				count ++;
			}
				year ++;
		}
		System.out.println(count);
	}
}
