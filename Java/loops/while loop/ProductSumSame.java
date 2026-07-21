import java.util.Scanner;
class ProductSumSame
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int product = 1;
		int sum = 0;
		
		while(num != 0)
		{
			int last = num % 10;
			System.out.println(last); 
			
			product = product * last ;
			sum = sum + last;
			
			
			num /= 10;
		}
		System.out.println("The Product of Digit is : "+product);
		System.out.println("The Sum of Digit is :"+sum);
		
		if(product == sum)
		{
			System.out.println("The Product and Sum of digits are same");
		}else{
			System.out.println("The Product and Sum of digits are not same");
		}
		
		}
	}

