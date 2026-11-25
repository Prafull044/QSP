class FindFrequency
{
	public static void main(String[] args) 
	{
	   int [] arr = {12,23,12,32,32,32,323,2,222,3};
	   frequency(arr);
	}
	
	public static void frequency(int [] nums)
	{
		boolean [] visited = new boolean[nums.length];
		for(int i = 0 ; i<nums.length ; i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count = 1;
			
			for(int j = i+1 ; j<nums.length ;j++)
			{
				if(nums[j] == nums[i])
				{
					count++;
					visited[j] = true;
				}
			}
			
			System.out.println(nums[i] + " count is " + count);
		}	
	}
}
