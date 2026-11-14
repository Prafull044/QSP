// Segregate Prime and Non-Prime Numbers
import java.util.Arrays;
class  PrimeNonPrime
{
	public static void main(String[] args) 
	{
		int [] arr = {12,545,322,45,15,323,6,7,8,243,53,345435,43,453,4,435,435,35,345,45,34534525,5,24,52};
		prime(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void prime(int [] num)
	{
		int i = 0;
		int j = num.length - 1;
		while(i < j)
		{
			if(isPrime(num[i]))
				{
					i++;
				}else if(!(isPrime(num[j])))
				{
					j--;
				}else{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
		}
	}
	
	public static boolean isPrime(int num)
	{
		if(num <= 1) return false;
		
		for(int i = 2; i<= num/2 ; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
