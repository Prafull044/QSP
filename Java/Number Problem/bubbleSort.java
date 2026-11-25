import java.util.*;
class  bubbleSort
{
	public static void main(String[] args) 
	{
		int [] arr= {23,43,2,32,424,24,24,424,24,2,42,2,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int [] nums)
	{
		for(int i = 0; i<nums.length-1;i++)
		{
			for(int j = 0; j<nums.length-1-i;j++)
			{
				if(nums[j] > nums[j+1])
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
	
}
