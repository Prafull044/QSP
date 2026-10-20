// 2.WAP to print avg of array elements 
class  AvgOFArray
{
	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50};
		System.out.println("Avg of Array  " +  avgArray(arr));
	}
	
	public static int avgArray(int[] num)
	{
		int sum = 0;
		for (int i = 0;i<num.length ;i++ )
		{
		sum += num[i];
	    }
		
		return sum /num.length;
	}
	
}
