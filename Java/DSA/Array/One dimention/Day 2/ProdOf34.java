// 42)WAP to product of value which are divisible by both 3&4 from integer array
class ProdOf34 
{
	public static void main(String[] args) 
	{
		
		int [] arr = {12,45,66,88,766,56,77,99};
		print(arr);
	}
	
	public static void print(int [] arr)
	{
		int prod = 1;
		for (int i =0;i<arr.length ;i++ )
		{
			if (arr[i] % 3 == 0 && arr[i] % 4 == 0)
			{
			 prod *= arr[i];	
			}
		}
		System.out.println(prod);
	}
	
}
