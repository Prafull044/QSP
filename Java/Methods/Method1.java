import java.util.Scanner;
class Method1 
{
	static int num;
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	num = sc.nextInt();
    numCall();
	
	}
	
	public static void numCall()
		{
	      reverseNumber();
	      sumOfDigit();
	      productOfDigit();
		}
	
	public static void reverseNumber()
	{
		int rev = 0;
		int dup = num;
		while (dup != 0)
		{
			rev = rev * 10 + (dup % 10);
			dup /= 10;
		}
		System.out.println("Reverse : " + rev);
	}
	
	public static void sumOfDigit()
		{
			int sum = 0;
			for (int i = num ;i!= 0 ;i/=10 )
			{
			   sum = sum + i% 10;
			}
			System.out.println("Sum : " + sum);
		}
		
	public static void productOfDigit()
		{
			int pro = 1;
			for (int  i = num;i!= 0 ;i/= 10 )
			{
				pro = pro * (i%10);
			}
				System.out.println("Product : " + pro);
		}
}
