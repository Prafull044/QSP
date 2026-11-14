// Segregate Duck and Non-Duck Numbers
import java.util.Arrays;
class  DuckNonDuck
{
	public static void main(String[] args) 
	{
		int[] arr = {121, 66, 25, 19910, 909, 28, 144, 22, 4, 145, 1};
		duck(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void duck(int [] num)
	{
		int i = 0;
		int j = num.length - 1;
		while(i < j)
		{
			if(isDuck(num[i]))
				{
					i++;
				}else if(!(isDuck(num[j])))
				{
					j--;
				}else{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
		}
	}
	
	public static boolean isDuck(int num)
	{
		while (num != 0)
		{
			if ((num % 10) == 0 )
			{
				return true;
			}
			num /= 10;
		}
        return false;
	}
	
	
}
