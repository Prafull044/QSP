// Segregate Happy and Non-happy Numbers
import java.util.Arrays;
class  HappyNonHappy
{
	public static void main(String[] args) 
	{
		int[] arr = {121, 66, 25, 1991, 99, 28, 144, 22, 4, 145, 1};
		happy(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void happy(int [] num)
	{
		int i = 0;
		int j = num.length - 1;
		while(i < j)
		{
			if(isHappy(num[i]))
				{
					i++;
				}else if(!(isHappy(num[j])))
				{
					j--;
				}else{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
		}
	}
	
	public static boolean isHappy(int num)
	{
		while (num != 1 && num != 4)
		{
			num = sumOfSqrNum(num);
		}
        return num == 1;
	}
	
	public static int sumOfSqrNum(int num )
	{
		int sum = 0;
		while (num != 0)
		{
			sum = sum +((num%10) * (num%10));
			num /= 10;
		}
		return sum ;
	}
}
