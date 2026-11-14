class palin
{
	public static void main(String[] args) 
	{
		int [] arr = {12,33,44,55,783,333,3222233,908};
		isPalindrome(arr);
	}
	
	
	public static void isPalindrome(int [] arr)
	{
		for (int i = 0;i<arr.length ;i++ )
		{
			int rev = 0;
			int num = arr[i];
			while (arr[i] != 0)
			{
				rev = rev * 10 + (arr[i] % 10);
				arr[i] /= 10;
			}
			if (rev == num)
			{
				System.out.println(num + "palindrom");
			}
		}
	}
}
