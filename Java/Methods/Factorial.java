import java.util.Scanner;
class Factorial 
{
	static int num;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            System.out.println("Factorial is : "+ getFactorial());
        }
		
	}
	
	public static long getFactorial()
		{
			long fact = 1;
			for (int i = 1;i<= num ;i++ )
			{
				fact = fact * i;
			}
			return fact;
		}
}
