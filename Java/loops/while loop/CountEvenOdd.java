import java.util.Scanner;
class CountEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		
		while(num != 0)
		{
			int last = num % 10;
			if(last % 2 == 0){
				evenCount ++;
			}
			else{
				oddCount ++;
			}
			num /= 10;
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
			
		}
	}

