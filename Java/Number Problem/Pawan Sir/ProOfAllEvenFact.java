// Product of all Even Factors

import java.util.Scanner;
class ProOfAllEvenFact
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int prod = 1;
		
		for (int i = 1; i<= num ; i++ )
		{
			if (num % i == 0 && i % 2 == 0)
			{
				prod = prod * i;
				System.out.println(i);
			}
		}
		System.out.println(prod+ " : is the Product of all Even factors");
	}
}

