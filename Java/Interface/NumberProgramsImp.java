public class NumberProgramsImp implements NumberPrograms
{
	public void areaOfCircle(int rad)
	{
		double area = pi * (rad*rad);
		System.out.println(area);
	}
	
	public void perimeterOfCircle(int rad)
	{
		double perimeter = 2 * pi * rad;
		System.out.println(perimeter);
	}
	
	public boolean isArmstrong(int num)
	{
		int ct = count(num);
		int sum = 0;
		for(int i = num; i != 0; i/= 10)
		{
			sum += power(i%10 ,ct);
		}
		return num == sum ;
	}
	
	private int count(int num)
	{
		int ct = 0;
		while(num != 0)
		{
			ct++;
			num/= 10;
		}
		return ct;
	}
	
	private int power(int base , int raise)
	{
		int pow = 1;
		while(raise>0)
		{
			pow *= base;
			raise--;
		}
		return pow;
	}
	
	public boolean isPalindrome(int num)
	{
		return num == NumberPrograms.reverse(num);
	}
	
	public void squarePattern(int n)
	{
		for(int i=0; i< n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	
	
	public boolean twistedPrime(int num)
	{
		return NumberPrograms.isPrime(num) && 
			   NumberPrograms.isPrime(NumberPrograms.reverse(num));
	}
}
