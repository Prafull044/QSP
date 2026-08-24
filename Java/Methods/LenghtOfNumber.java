import java.util.Scanner;
class LenghtOfNumber 
{
	static long num;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextLong();
		System.out.println("Lenght of Number is : "+ getLenghtNum());
	}
	
	public static long getLenghtNum()
	{
		long count = 0;
		for (long i = num; i != 0 ;i/= 10 )
		{
			count++;
		}
		return count;
	}
}
