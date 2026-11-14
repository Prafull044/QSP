import java.util.Arrays;
class InsertionSort 
{
	public static void main(String[] args) 
	{
		int [] nums = {10,34,221,33,32,3};
		System.out.println(Arrays.toString(nums));
	    insertion(nums);
	}
	
	public static void insertion(int [] nums)
	{
		for(int i = 1 ; i<nums.length; i++)
		{
			int key = nums[i];
			int j = i-1;
			
			while( j >= 0 && nums[j] > key)
			{
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
		System.out.println(Arrays.toString(nums));
	} 
}