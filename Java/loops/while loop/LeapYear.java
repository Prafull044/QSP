class LeapYear 
{
	public static void main(String[] args) 
	{
		int year = 1000;
		while (year <= 3000)
		{
			if(((year % 4== 0) && (year % 100 != 0)) || (year % 400 == 0) )
			{
				System.out.println(year);
			}
			year ++ ; 
		}
	}
}
