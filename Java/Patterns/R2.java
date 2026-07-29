import java.util.Scanner;
class R2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		for (int i = 0;i< num ;i++ )
		{
			for (int j = 0; j< num ;j++ )
			{
				if (i == 3*num/4 || j == 3*num/4 || i == num/4 || j == num/4 ||
					j==0 && i<num/4 || i== 0 && j<num/4 || i==0 && j>3*num/4 || 
					j==num-1 && i< num/4 || j == num-1 && i> 3*num / 4 || i == num-1 && j > 3*num/4 ||
					i > 3*num/4 &&  j == 0 || i == num-1 && j< num/4  ||
					i == num/8 && j == num/8 || i == num/8 && j == 7*num/8 ||
					j == num/8 && i == 7*num /8 || i == 7*num/8 && j==7*num/8 || i == num/2 && j == num/2 ||
					i == j && i < num/4  || i == j && i > 3*num/4 || i+j == num-1 && i > 3*num/4 || i+j == num-1 && i <num/4 )
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
	}
}
