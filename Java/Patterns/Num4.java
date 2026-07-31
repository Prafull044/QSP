import java.util.Scanner;
class Table
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Rows ");
		int n = sc.nextInt();
		
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		int a = num;
		
		for (int i = 1;i<= n ;i++ )
		{
			for (int j = 1;j<= n ;j++ )
			{
				System.out.print(a+ " ");
				if(a< 10)
				{
					System.out.print(" ");
				}
				a = a + num;
			}
			System.out.println();
		}
	}
}
