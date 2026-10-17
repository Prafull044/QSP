import java.util.Scanner;
class TwistedPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("Enter a number");
	   int num = sc.nextInt();
	   
	   if (num <= 1)
	   {
		   System.out.println("not Twisted Prime number");
		   return;
	   }
	   else
		{
	   for (int i = 2; i <= num/2 ; i++ )
	   {
		   if (num % i == 0)
		   {
			   System.out.println("Not a Twisted Prime");
			   return;
		   }
	   }
	   }
	   
	   int rev = 0;
	   while (num != 0)
	   {
		   int last = num % 10;
		   
		   rev = rev * 10 + last;
		   num = num / 10;
	   }
	   
	   boolean isPrime = true;
	   
	    for (int i = 2; i <= rev/2 ; i++ )
	   {
		   if (rev % i == 0)
		   {
			   isPrime = false;
			   break;
		   }
	   }
	   
	   if (isPrime)
	   {
		   System.out.println("Twisted Prime");
	   }
	   else
		{
			System.out.println("Not Twisted Prime");
		}
	   
	   
		 
		 
	}
}
