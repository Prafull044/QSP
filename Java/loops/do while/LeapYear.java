class LeapYear
{
	public static void main(String[] args) 
	{
		int year = 1000;
		int count = 0;
		
		do{
			if(((year % 4== 0) && (year % 100 != 0)) || (year % 400 == 0) )
			{
				System.out.println(year);
				count ++;
			}
			year ++ ; 
			
		}
		while (year <= 3000);
		System.out.print("number of Leap Year beetween 2000 to 3000  : " +count);
	}
}
