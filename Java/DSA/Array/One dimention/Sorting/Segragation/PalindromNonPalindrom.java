// Segregate Palindron and Non-Palindron Numbers
import java.util.Arrays;
class  PalindromNonPalindrom
{
	public static void main(String[] args) 
	{
		int[] arr = {121, 66, 25, 1991, 99, 28, 144, 22, 4, 145, 1};
		palindrom(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void palindrom(int [] num)
	{
		int i = 0;
		int j = num.length - 1;
		while(i < j)
		{
			if(isPalin(num[i]))
				{
					i++;
				}else if(!(isPalin(num[j])))
				{
					j--;
				}else{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
		}
	}
	
	public static boolean isPalin(int num)
	{
		int rev =0 ;
		int n = num;
		while (num != 0)
		{
			rev = rev * 10 + (num%10);
			num /= 10;
		}
		return rev == n;
	}
}
