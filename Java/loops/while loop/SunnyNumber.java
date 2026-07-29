import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int num2 = num + 1;
		
		if (num <= 0)
		{
			System.out.println("Not Sunny Number");
					
		}
		else
		{
			int i = 1;	
			while (i * i  <= num2)
			{
				if (i * i == num2)
				{
					System.out.println("Sunny Number");
					return;
				}
				
				i++;
			}
				
			System.out.println("Not Sunny Number");
			return;
				
			
			
		}

}
}