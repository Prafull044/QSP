import java.util.Scanner;
class HarshadNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while (num != 0)
		{
			sum = sum + (num % 10);
			num /= 10;
		}
		if (temp % sum == 0)
		{
			System.out.println(temp+ " is Harshad Number");
		}
		else{
			System.out.println(temp+ " is not a Harshad Number");
		}
	}
}
