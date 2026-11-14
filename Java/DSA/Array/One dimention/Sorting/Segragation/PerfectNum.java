//Segregate Perfect Squares
import java.util.Arrays;
class  PerfectNum
{
	public static void main(String[] args) 
	{
		int[] arr = {7, 121, 6, 25, 19, 9, 28, 144, 22, 4, 145, 1};
		perfect(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void perfect(int [] num)
	{
		int i = 0;
		int j = num.length - 1;
		while(i < j)
		{
			if(isPerfect(num[i]))
				{
					i++;
				}else if(!(isPerfect(num[j])))
				{
					j--;
				}else{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
		}
	}
	
	public static boolean isPerfect(int num)
	{
		
		
		for(int i = 1; i< num ; i++)
		{
			if (num == i * i)
			{
				return true;
			}
		}
		return false;
	}
}

