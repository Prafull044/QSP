import java.util.Scanner;
class StrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int num2 = num;
		int sum = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			int fact = 1;
			
			for (int i = 1;i<= digit ;i++ )
			{
				fact = fact * i;
			}
			sum = sum + fact;
			num /= 10;
			
		}
		if (sum == num2)
		{
			System.out.println("The Number is Strong Number");
		}
	     else{
			System.out.println("The no is not Strong Number");
	     }
	}
}
