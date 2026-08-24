import java.util.Scanner;
class Divisor 
{
	static int num ;
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		num = new Scanner(System.in).nextInt();
		divisor();
	}
	public static void divisor(){
		int div = 1 ;
		String str = num + "";
		for (int i = 1; i <=  str.length()-1 ; i++  )
		{
			div *= 10;
		}
		System.out.println(div);
	}
}