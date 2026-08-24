import java.util.Scanner;
class Neon 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sqr = num * num;
		int sum = 0;
		
		while (sqr != 0)
		{
			sum = sum + (sqr % 10);
			sqr /= 10;
		}
		if (sum == num)
		{
			System.out.println(num+ " is Neon Number");
		}
		else{
		System.out.println(num+ " is not Neon Number");
		}
	}
}
